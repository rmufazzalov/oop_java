import units.Archer;
import units.Man;
import units.Sniper;
import units.XBowMan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Sniper archer = new Sniper("Vanya");

        ArrayList<Man> list = new ArrayList<>();
        list.add(new XBowMan("Ваня"));
        list.add(new Sniper("Петя"));

        list.forEach(n -> System.out.println(n.toString())); //переопределили toString в классе юнита
    }
}