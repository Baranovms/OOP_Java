package OOP_JAVA.HW_2;

public class Rogue extends BaseHero {

    public Rogue(String name) {
        super(name, 120);
    }

    public Rogue() {
        super();
    }

    public void pickPocket() {
        System.out.println(this.name + " is picking pockets.");
    }

    public void sneak() {
        System.out.println(this.name + " is sneaking around.");
    }
    public void step() {
        System.out.println("Rogue walks...");
    }
    public String getInfo() {
        return "Я Разбойник";
    }

    @Override
    public void specialAbility() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }
}