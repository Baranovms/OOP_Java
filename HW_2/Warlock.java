package OOP_JAVA.HW_2;

public class Warlock extends BaseHero {

    public Warlock(String name) {
        super(name, 50);
    }

    public Warlock() {
        super();
    }

    public void curse() {
        System.out.println(this.name + " is cursing the enemy.");
    }

    public void summonDemon() {
        System.out.println(this.name + " is summoning a demon.");
    }

    public void step() {
        System.out.println("Warlock walks...");
    }

    public String getInfo() {
        return "Я Колдун";
    }

    @Override
    public void specialAbility() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }
}
