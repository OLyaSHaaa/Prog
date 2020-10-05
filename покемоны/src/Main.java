import Pokemone.*;
import Moves.*;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle war = new Battle();
        Pokemon p1 = new Corsola("Corsola", 2);
        Pokemon p2 = new Sunkern("Sunkern", 2);
        Pokemon p3 = new Sunflora("Sunflora", 2);
        Pokemon p4 = new Ralts("Ralts", 3);
        Pokemon p5 = new Kirlia("Kirlia", 3);
        Pokemon p6 = new Gardevoir("Gardevoir", 3);
        //Pokemon p7 = new Pokemon("Чужой", 1);
        //Pokemon p8 = new Pokemon("Хищник", 1);
        war.addAlly(p1);
        war.addAlly(p2);
        war.addAlly(p3);
        war.addAlly(p4);
        war.addFoe(p5);
        war.addFoe(p6);
        //war.addFoe(p7);
       // war.addFoe(p8);
        war.go();
    }
}
