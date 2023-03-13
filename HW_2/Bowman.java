package OOP_JAVA.HW_2;

public class Bowman extends BaseHero {
    
    public Bowman(String name, int hp) {
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

    public void step() {
        System.out.println("Bowman walks...");
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик";
    }

    @Override
    public void specialAbility() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }
}