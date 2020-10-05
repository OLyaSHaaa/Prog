package Pokemone;
import Moves.Sunflora.Pound;
import Moves.Sunkern.Confide;
import Moves.Sunkern.Rest;
import Moves.Sunkern.SwordsDance;
import ru.ifmo.se.pokemon.*;
public class Sunflora extends Pokemon {

    public Sunflora(String name, int level) {
        super(name, level); // 2
        setStats(75, 75, 55, 105, 85, 30);
        setType(Type.GRASS);
        setMove(new Rest(), new Confide(), new Pound(), new SwordsDance());

    }
}

