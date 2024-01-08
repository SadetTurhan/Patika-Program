import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    private Scanner input = new Scanner(System.in);
    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }
    public void selectChar(){

        GameChar[] charList = {new Samurai(),new Archer(),new Knight()};

        System.out.println("------------------------------");
        for(GameChar gameChar: charList){
            System.out.println("ID : " + gameChar.getId() +
                    "\t Karakter: " + gameChar.getName() +
                    "\t\t Hasar: " + gameChar.getDamage() +
                    "\t\t Sağlık: " + gameChar.getHealth() +
                    "\t\t Para: " + gameChar.getMoney());
        }
        System.out.println("------------------------------");
        System.out.println("Lütfen bir karakter seçiniz !");
        int selectChar = input.nextInt();
        switch (selectChar){
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

    }
    public void initPlayer(GameChar gameChar){
            this.setDamage(gameChar.getDamage());
            this.setHealth(gameChar.getHealth());
            this.setMoney(gameChar.getMoney());
            this.setCharName(gameChar.getName());
    }
    public void printInfo(){
        System.out.println("Karakter : " + this.getCharName() +
                "\t Silahınız: " + this.getInventory().getWeapon().getName() +
                "\t, Zırhınız: " + this.getInventory().getArmor().getName() +
                "\t, Hasarınız: " + this.getDamage() +
                "\t, Bloklama: " + this.getInventory().getArmor().getBlock() +
                "\t, Sağlığınız: " + this.getHealth() +
                "\t, Paranız: " + this.getMoney());
    }
    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
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

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
