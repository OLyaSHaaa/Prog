package Pokemone;
import Moves.Sunkern.Confide;
import Moves.Sunkern.Rest;
import Moves.Sunkern.SwordsDance;
import ru.ifmo.se.pokemon.*;
public class Sunkern extends Pokemon {

    public Sunkern(String name, int level) {
        super(name, level); // 2
        setStats(30, 30, 30, 30, 30, 30);
        setType(Type.GRASS);
        setMove(new Rest(), new SwordsDance(), new Confide());
    }
}
