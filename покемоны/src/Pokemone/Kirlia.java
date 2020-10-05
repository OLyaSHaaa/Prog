package Pokemone;
import Moves.Kirlia.Charm;
import Moves.Ralts.DisarmingVoice;
import Moves.Ralts.Facade;
import ru.ifmo.se.pokemon.*;
public class Kirlia extends Pokemon {

    public Kirlia(String name, int level) {
        super(name, level); // 3
        setStats(38, 35, 35, 65, 55, 50);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Facade(), new DisarmingVoice(), new Charm());
    }
}