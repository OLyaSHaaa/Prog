package Moves.Corsola;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class HeadSmash extends PhysicalMove {
    public HeadSmash() {
        super(Type.ROCK, 150, 80);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 75);
    }

    protected String describe() {
        return "пацан к успеху шел... не фортануло";
    }
}
