package OOP_JAVA.HW_1;

public class Sniper extends BaseHero {
    public Sniper(String name) {
        super(name, 50);
    }

    public Sniper() {
        super();
    }

    public void aim() {
        System.out.println(this.name + " is aiming the sniper rifle.");
    }

    public void shoot() {
        System.out.println(this.name + " is shooting the sniper rifle.");
    }

    public void step() {
        System.out.println("Sniper walks...");
    }

    @Override
    public String getInfo() {
        return "Я Снайпер";
    }
}