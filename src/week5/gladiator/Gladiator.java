package week5.gladiator;

public abstract class Gladiator {

    protected int health;
    protected String name;

    abstract int bit();
    abstract int defence();


    public void setHealth(int health) {
        this.health = health;

    }

    public void setName(String name) {
        this.name = name;
    }
}
