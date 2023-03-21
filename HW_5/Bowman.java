package OOP_JAVA.HW_5;

public class Bowman extends ShooterClass {

    public Bowman(String name, int x, int y) {
        super(430, 290, 52, 65, 50, 23, name, x, y);
    }

    @Override
    public String getName() {
        return "Bowman";
    }
}
