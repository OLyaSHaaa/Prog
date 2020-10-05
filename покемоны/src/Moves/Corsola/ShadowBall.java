package Moves.Corsola;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
            super(Type.GHOST, 80, 100);
        }
        @Override
        protected void applyOppEffects(Pokemon p){
            if (Math.random() <= 0.2) p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }

    protected String describe() {
        return "ОДИН ЗА ВСЕХ !... один за всех ";
    }
}

