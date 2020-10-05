package Moves.Ralts;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status c = def.getCondition();
        if (c.equals(Status.BURN) || c.equals(Status.POISON) || c.equals(Status.PARALYZE)) {
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
    }
    protected String describe() {
        return "я неоспорим";
    }
}

