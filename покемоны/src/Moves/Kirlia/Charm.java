package Moves.Kirlia;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Charm extends StatusMove {
    public Charm(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -2);
    }
    protected String describe() {
        return "Дед сошел с ума и рассказывает про карты Таро";
    }
    }
