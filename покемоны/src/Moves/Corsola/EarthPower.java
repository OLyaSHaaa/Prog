package Moves.Corsola;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

    public class EarthPower extends SpecialMove {
        public EarthPower() {
            super(Type.GROUND, 90, 100);
        }

        @Override
        protected void applyOppEffects(Pokemon p) {
            if (Math.random() <= 0.1) p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }

        protected String describe() {
            return "кродетца...";

        }
    }

