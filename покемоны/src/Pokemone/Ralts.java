package Pokemone;
import Moves.Ralts.DisarmingVoice;
import Moves.Ralts.Facade;
import ru.ifmo.se.pokemon.*;
public class Ralts extends Pokemon {

    public Ralts(String name, int level) {
        super(name, level); // 3
        setStats(28, 25, 25, 45, 35, 40);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Facade(), new DisarmingVoice());
    }
}