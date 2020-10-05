package Pokemone;
import Moves.Corsola.Swagger;
import Moves.Kirlia.Charm;
import Moves.Ralts.DisarmingVoice;
import Moves.Ralts.Facade;
import ru.ifmo.se.pokemon.*;
public class Gardevoir extends Pokemon {

    public Gardevoir(String name, int level) {
        super(name, level); // 3
        setStats(68, 65, 65, 125, 115, 80);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Facade(), new Charm(), new DisarmingVoice(), new Swagger());
    }
}
