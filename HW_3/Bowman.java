package OOP_JAVA.HW_3;

public class Bowman extends BaseHero {

    private int shots;
    private int minDamage;
    private int maxDamage;

    public Bowman(String name, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed,
            int delivery, int magic) {
        super(name, attack, defense, health, speed, delivery, magic);
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public Bowman(String name, int health, int speed) {
        super(name, 6, 3, 10, 4, 0, 0);
        this.shots = 16;
        this.minDamage = 2;
        this.maxDamage = 3;
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