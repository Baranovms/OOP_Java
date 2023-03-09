package OOP_JAVA.HW_1;

public class Bowman extends BaseHero {

    public Bowman(String name) {
             super(name, 100);
         }

    public Bowman() {
             super();
         }

    public void reload() {
        System.out.println(this.name + " is reloading their crossbow.");
    }

    public void fire() {
        System.out.println(this.name + " is firing their crossbow.");
    }

    @Override
    public void step() {
        System.out.println("Арбалетчик высрелил!");
    }
}