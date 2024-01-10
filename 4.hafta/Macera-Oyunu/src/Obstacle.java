public class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int award;
    private int orijinalHealth;
    public Obstacle(int id, String name,int damage, int health,int award) {
        this.id = id;
        this.name = name    ;
        this.damage = damage;
        this.health = health;
        this.orijinalHealth = health;
        this.award = award;
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

    public int getAward() {
        return award;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrijinalHealth(int orijinalHealth) {
        this.orijinalHealth = orijinalHealth;
    }

    public int getOrijinalHealth() {
        return orijinalHealth;
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

    public void setAward(int award) {
        this.award = award;
    }
}
