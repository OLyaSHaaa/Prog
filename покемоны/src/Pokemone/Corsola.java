package Pokemone;
import Moves.Corsola.EarthPower;
import Moves.Corsola.HeadSmash;
import Moves.Corsola.ShadowBall;
import Moves.Corsola.Swagger;
import ru.ifmo.se.pokemon.*;
public class Corsola extends Pokemon {

        public Corsola(String name, int level) {
            super(name, level); // 2
            setStats(65, 55, 95, 65, 95, 35);
            setType(Type.WATER, Type.ROCK);
            setMove(new EarthPower(), new HeadSmash(), new ShadowBall(), new Swagger());
        }
    }


