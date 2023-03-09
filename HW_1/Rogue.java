package OOP_JAVA.HW_1;

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
    
    @Override
    public String getInfo() {
        return "Я Разбойник";
    }
}