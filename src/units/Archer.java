package units;

public abstract class Archer extends Man{

    protected int shots, maxShots;
    protected String name;
    public Archer(int hp, int maxHp, int att, int def, int shots, int maxShots, String name) {
        super(hp, maxHp, att, def);
        this.shots = shots;
        this.maxShots = maxShots;
        this.name = name;
    }

    public int getAtt(){
        return super.att;
    }
}
