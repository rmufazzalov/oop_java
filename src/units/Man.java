package units;

public abstract class Man { //abstract чтобы нельзя было создать такой объект
    protected int hp, maxHp, att, def;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp > 0) this.hp = hp; //setter должен что-то фильтровать
    }

    public Man(int hp, int maxHp, int att, int def) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.att = att;
        this.def = def;
    }

}
