package Moves.Sunkern;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
        public Rest(){
            super(Type.PSYCHIC, 0, 0);
        }
        @Override
        protected void applyOppEffects(Pokemon p){
            p.setMod(Stat.HP, + ((int) p.getHP()));
            Effect.sleep(p);
        }
    protected String describe() {
        return "бессонница - моя главная поклонница";
    }
}

