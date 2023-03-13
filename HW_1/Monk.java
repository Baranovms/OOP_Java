package OOP_JAVA.HW_1;

public class Monk extends BaseHero {

    public Monk(String name) {
        super(name, 90);
    }

    public Monk() {
        super();
    }

    public void meditate() {
        System.out.println(this.name + " is meditating.");
    }

    public void heal() {
        System.out.println(this.name + " is using their healing powers.");
    }
    public void step() {
        System.out.println("Monk moving...");
    }

    @Override
    public void specialAbility() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }
}