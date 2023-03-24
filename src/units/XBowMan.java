package units;

public class XBowMan extends Archer{
    public XBowMan(String name) {

        super(1,1,1,1,1,1, name);
    }
    public XBowMan(String name, int hp) { //перегрузка, конструктор позволяет создать арбалетчика с другим количеством hp

        super(hp,hp,1,1,1,1, name);
    }

    @Override
    public String toString() {
        return "Арбалетчик " + name;
    }
}
