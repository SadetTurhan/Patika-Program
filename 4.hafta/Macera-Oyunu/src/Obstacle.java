public class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int health;

    public Obstacle(int id, String name,int damage, int health) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
