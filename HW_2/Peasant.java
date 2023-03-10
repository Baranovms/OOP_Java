package OOP_JAVA.HW_2;

public class Peasant extends BaseHero {

    public Peasant(String name) {
        super(name, 100);
    }

    public void plow() {
        System.out.println(this.name + " is plowing the field.");
    }

    public void harvest() {
        System.out.println(this.name + " is harvesting the crops.");
    }

    public void step() {
        System.out.println("Peasant walks...");
    }

    @Override
    public String getInfo() {
        return "Я крестьянин";
    }

    @Override
    public void specialAbility() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }
}