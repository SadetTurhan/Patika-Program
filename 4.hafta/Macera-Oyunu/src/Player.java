import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orijinalHealth;
    private int money;
    private String name;
    private String charName;
    Scanner input = new Scanner(System.in);
    private Inventory inventory;
    private String[] awards = new String[4];
    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }
    public void selectChar(){
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("--------------------------------");
        for(GameChar gameChar : charList){
            System.out.println("ID : " + gameChar.getId() +
                               "\t\t Karakter: " + gameChar.getName() +
                               "\t\t Hasar : " + gameChar.getDamage() +
                               "\t\t Sağlık : " + gameChar.getHealth() +
                               "\t\t para : " + gameChar.getMoney());
        }
        System.out.println("--------------------------------");
        System.out.println("Lütfen bir karakter seçiniz ! ");
        int selectChar = input.nextInt();
        switch(selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakter : " + this.getCharName() +
                ", Hasar : " + this.getDamage() +
                ", Sağlık : " + this.getHealth() +
                ", Para : " + this.getMoney());
    }
    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrijinalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
    public void printInfo(){
        System.out.println("Silahınız : " + this.getInventory().getWeapon().getName() +
                ", Zırhınız : " + this.getInventory().getArmor().getName() +
                ", Bloklama : " + this.getInventory().getArmor().getBlock() +
                ", Hasarınız : " + this.getTotalDamage() +
                ", Sağlığınız : " + this.getHealth() +
                ", Paranız : " + this.getMoney());
    }
    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getCharName() {
        return charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        if(health < 0){
            health = 0;
        }
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrijinalHealth() {
        return orijinalHealth;
    }

    public void setOrijinalHealth(int orijinalHealth) {
        this.orijinalHealth = orijinalHealth;
    }

    public String[] getAwards() {
        return awards;
    }

    public void setAwards(String[] awards) {
        this.awards = awards;
    }
}
