package units;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero {

    protected int ammunition;

    public Shooter(String name, int hp, int maxHp, int attack, int damageMin, int damageMax,
                   int defense, int speed, int ammunition, int team, int coordX, int coordY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, team, coordX, coordY);
        this.ammunition = ammunition;
    }

    @Override
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
        if (state.equals("Die")) return;
        for (BaseHero hero : friend) {
            if (hero.getUnitName().charAt(0) == 'Ф'
                    && hero.state.equals("Stand")) {
                ammunition++;
                hero.state = "Busy";
                break;
            }
        }
        if (ammunition > 0) {
            BaseHero target = enemy.get(findNearest(enemy)); // цель атаки
            target.getDamage(calculateDamage(target.defense));
            ammunition--;
        }
    }

    private float calculateDamage(int targetDefense) {

        int a = targetDefense - attack;
        if (a < 0) return damageMax;
        else if (a == 0) return (float) (damageMax + damageMin) / 2;
        else return damageMin;

    }

}
