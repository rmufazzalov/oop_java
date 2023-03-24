package units;

import java.util.ArrayList;


public class Villager extends BaseHero {


    public Villager(String name, int team, int coordX, int coordY) {
        super(name, 5, 5, 1, 1, 1,
                1, 3, team, coordX, coordY);
    }

    @Override
    public String getInfo() {
        return "Фермер " + name +
                " speed:" + speed +
                " hp:" + hp +
                " state:" + state;
    }

    @Override
    public String getUnitName() {
        return "Фермер " + name;
    }

    @Override
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
        if (!state.equals("Die")) state = "Stand";
    }

}
