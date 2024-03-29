package OOP_JAVA.HW_4;

public class Rogue extends BaseHero {

    private int shots;
    private int minDamage;
    private int maxDamage;

    public Rogue(String name) {
        super(name, 8, 3, 10, 6, 0, 0);
        this.shots = 0;
        this.minDamage = 2;
        this.maxDamage = 4;
    }

    public Rogue(String name, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed,
            int delivery, int magic) {
        super(name, attack, defense, health, speed, delivery, magic);
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int getShots() {
        return shots;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}