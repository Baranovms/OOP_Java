package OOP_JAVA.HW_3;

public class Monk extends BaseHero {

    private int magic;

    public Monk(String name, int attack, int defense, int shots, int damageMin, int damageMax,
            int health, int speed, int mana) {
        super(name, attack, defense, shots, damageMin, damageMax, health, speed);
        this.magic = mana;
    }

    public Monk(String name) {
        super(name, 12, 7, 0, -4, -4, 30, 5);
        this.magic = 1;
    }

    public int getMagic() {
        return magic;
    }
}