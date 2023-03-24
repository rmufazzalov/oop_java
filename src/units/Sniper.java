package units;

public class Sniper extends Archer {



    public Sniper(String name) {
        super(1,1,1,1,1,1, name);
    }
    @Override
    public String toString() {
        return "Снайпер " + name;
    }
}
