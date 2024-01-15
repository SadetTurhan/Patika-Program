import java.util.Random;

public class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattleLoc(Player player,String name,Obstacle obstacle, String award, int maxObstacle){
        super(player,name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }
    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }
    @Override
    public boolean onLocation(){
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şu an buradasınız : " + this.getName());
        System.out.println("Dikkatli ol! Burada " + obsNumber + " tane " + this.getObstacle().getName() + " yaşıyor !");
        System.out.println("<S>avaş veya <K>aç!");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if(selectCase.equals("S")){
            if(combat(obsNumber)){
                System.out.println(this.getName() + " tüm düşmanları yendiniz");
                return true;
            }
        if(this.getPlayer().getHealth() <= 0){
            System.out.println("Öldünüz ! ");
            return false;
        }
        }
        return true;
    }

    public boolean combat(int obsNumber){
        for(int i = 1; i <= obsNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getOrijinalHealth());
            playerStats();
            obstacleStats(i);
            System.out.println("<V>ur veya <K>aç");
            String selectCombat = input.nextLine().toUpperCase();
            if(selectCombat.equals("V")){
                firstHit();
            }
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.println("<V>ur veya <K>aç");
                selectCombat = input.nextLine().toUpperCase();
                if(selectCombat.equals("V")){
                    System.out.println("Siz vurdunuz ! ");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getObstacle().getHealth() > 0){
                        System.out.println();
                        System.out.println("Canavar size vurdu ! ");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if(obstacleDamage < 0){
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                }
                else{
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("Düşmanı Yendiniz ");
                if (getObstacle().getName().equals("Snake")) {
                    drop();
                }else{
                    System.out.println(this.getObstacle().getAward() + " para kazandınız");

                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                    System.out.println("Güncel paranız: " + this.getPlayer().getMoney());

                }
            } else {
                return false;
            }
        }
        return true;
    }
    public void firstHit(){
        double hitChance = Math.random() * 100;
        if(hitChance > 50){
            System.out.println("Siz vurdunuz ! ");
            this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
            System.out.println("Canavar size vurdu ! ");
            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
            if(obstacleDamage < 0){
                obstacleDamage = 0;
            }
            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
            afterHit();
        }else{
            System.out.println("Canavar size vurdu ! ");
            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
            if(obstacleDamage < 0){
                obstacleDamage = 0;
            }
            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
            System.out.println("Siz vurdunuz ! ");
            this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
            afterHit();
        }
    }
    public void afterHit(){
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.obstacle.getName() + " canı :" + this.obstacle.getHealth());
        System.out.println("-----------------");
    }
    public void playerStats(){
        System.out.println("Oyuncu değeleri : ");
        System.out.println("-------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getWeapon().getName());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();
    }
    public void obstacleStats(int i){
        System.out.println(i + ". " + this.getObstacle().getName() + " Değerleri");
        System.out.println("-------------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Ödül : " + this.getObstacle().getAward());
        System.out.println();
    }
    public void drop() {
        Random r = new Random();
        int chance = r.nextInt() * 100;

        if (chance < 55) {
            Random r1 = new Random();
            int itemchance = r1.nextInt() * 100;
            if (itemchance <= 30) {
                int weaponChance = r1.nextInt() * 100;
                if (weaponChance <= 20) {
                    getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(3));
                    System.out.println(getPlayer().getInventory().getWeapon().getName() + " kazandiniz.");
                }
                if (20 < weaponChance && weaponChance <= 50) {
                    getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(2));
                    System.out.println(getPlayer().getInventory().getWeapon().getName() + " kazandiniz.");
                }
                if (50 < weaponChance) {
                    getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(1));
                    System.out.println(getPlayer().getInventory().getWeapon().getName() + " kazandiniz.");
                }

            }
            if (30 < itemchance && itemchance <= 60) {
                Random r2 = new Random();
                int armorChance = r2.nextInt() * 100;
                if (armorChance <= 20) {
                    getPlayer().getInventory().setArmor(Armor.getArmorObjByID(3));
                    System.out.println(getPlayer().getInventory().getArmor().getName() + " ele gecirildi.");
                }
                if (20 < armorChance && armorChance <= 50) {
                    getPlayer().getInventory().setArmor(Armor.getArmorObjByID(2));
                    System.out.println(getPlayer().getInventory().getArmor().getName() + " ele gecirildi.");
                }
                if (50 < armorChance) {
                    getPlayer().getInventory().setArmor(Armor.getArmorObjByID(1));
                    System.out.println(getPlayer().getInventory().getArmor().getName() + " ele gecirildi.");
                }
            }
            if (60 < itemchance) {
                Random r3 = new Random();
                int goldChance = r3.nextInt() * 100;
                if (goldChance <= 20) {
                    getPlayer().setMoney(getPlayer().getMoney() + 10);
                    System.out.println("10 Altın ele gecirildi.");
                }
                if (20 < goldChance && goldChance <= 50) {
                    getPlayer().setMoney(getPlayer().getMoney() + 5);
                    System.out.println("5 Altın ele gecirildi.");
                }
                if (50 < goldChance) {
                    getPlayer().setMoney(getPlayer().getMoney() + 1);
                    System.out.println("1 Altın ele gecirildi.");
                }
            }
        } else {
            System.out.println("Hiç bir sey kazanamadınız.");
        }
    }
    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
