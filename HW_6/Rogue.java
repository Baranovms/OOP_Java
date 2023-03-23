package OOP_JAVA.HW_6;

public class Rogue extends InfantClass {

    public Rogue(String name, int x, int y) {
        super(440, 360, 60, 75, 55, 430, name, x, y);
    }

    @Override
    public String getName(){
        return "Rogue";
    }

    // @Override
    // public void step(ArrayList<BaseHero> team1) {
    // // TODO Auto-generated method stub
    // }

}
