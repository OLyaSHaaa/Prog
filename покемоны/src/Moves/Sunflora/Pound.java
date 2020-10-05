package Moves.Sunflora;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Pound extends PhysicalMove {
        public Pound() {
            super(Type.NORMAL, 40, 100);
        }
    protected String describe() {
        return "у меня джип в москве, но я тебя сейчас сделаю здесь...";
    }
}
