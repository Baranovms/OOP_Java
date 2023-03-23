package OOP_JAVA.HW_6;

public class Sniper extends ShooterClass{


    public Sniper(String name, int x, int y) {
        super(450, 260, 38, 43, 40, 33, name, x, y);
    }

    @Override
    public String getName() {
        return "Sniper";
    }

}
