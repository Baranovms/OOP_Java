package OOP_JAVA.HW_4;

public class Warlock extends BaseHero {


    public Warlock(String name) {
        super(17, 12, 0, "-5", 30, 9, 0, 1, name);
    }


    public Warlock(int attack, int defense, int shots, String damage, int health, int speed, int delivery, int magic,
            String name) {
        super(attack, defense, shots, damage, health, speed, delivery, magic, name);
    }
}