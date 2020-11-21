public class Main {

    public static void main(String [] args) {


        String butName = Th.BUT.getName();
        String now2Name = Th.NOW2.getName();
        String againName = Th.AGAIN.getName();
        String likeName = Th.LIKE.getName();
        AllImpl allImpl = new AllImpl("все");
        Face face = new Face();
        face.setName("лицо ");
        Garden gr = new Garden();
        gr.setName(" сад ");
        King king = new King("Короля Рубинов");
        MagicManImpl wiz = new MagicManImpl("Волшебник");
        NoBody nb = new NoBody(" никто ");
        Queen queen = new Queen("Королева Рубинов");
        Smile smile = new Smile();
        smile.setName(" улыбкой ");
        Coat coat = new Coat();
        coat.setName("плащом");
        Mirow mirow = new Mirow();
        mirow.setName("зеркало");
        Hat hat = new Hat();
        hat.setName(" по шляпе,");
        Ears ears = new Ears();
        ears.setName("ушам,");
        Grass grass = new Grass();
        grass.setName("траве ");
        Boots boots = new Boots();
        boots.setName("и по башмакам");
        Bliznez bliz = new Bliznez();
        bliz.setName("близнец ");
        Light light = new Light();
        light.setName(" светом");
        Place place = new Place();
        EyeLashes eyeLashes = new EyeLashes();
        eyeLashes.setName(" рестницы ");
        Brother brother = new Brother();
        brother.setName(" брата");
        Tofsla tofsla = new Tofsla();
        tofsla.setName("Тофсла ");
        Wifsla wifsla = new Wifsla();
        wifsla.setName("Вифсла ");
        Party party = new Party();
        party.setName("празднество");
        Forehead forehead = new Forehead(" лбами");
        ForestLiversImpl.Que que = new ForestLiversImpl.Que();
        que.setName("очередь");
        ForestLiversImpl forestLivers = new ForestLiversImpl();
        forestLivers.setName(" жителей леса");
        Wheelbarrow wheelbarrow = new Wheelbarrow();
        wheelbarrow.setName("тачку");
        Pancakes pancakes = new Pancakes();
        pancakes.setName(" оладьев");
        FrekenSnork frekenSnork = new FrekenSnork("Фрекен Снорк ");
        Human.Mood mood = new Human.Mood();
        mood.setName(" настроении ");
        Dance dance = new Dance();
        dance.setName("танцы");
        Hemul hemul = new Hemul(" Хемуль ");
        Fireworks fireworks = new Fireworks();
        fireworks.setName(" фейрверками");
        MumiPapa mumiPapa = new MumiPapa(" Муми-папа ");
        Book book = new Book();
        Story story = new Story();
        story.setName(" рассказы ");
        book.setName(" мемуары ");


        frekenSnork.see(mirow);
        frekenSnork.cryLoud("от восторга ");
        FrekenSnork.Eyes eyes = frekenSnork.new Eyes();
        int a = 0;
        try {
            eyes.go(" были на месте ");
            a = 1;
        } catch (EyesOnPlace eyesOnPlace) {
            System.out.println(eyesOnPlace.getMessage());
            a = 2;
        } finally {
            if (a == 1)
                eyeLashes.stay("чуточку");
            else eyeLashes.stay("");
        }

        frekenSnork.shine(smile);
        frekenSnork.hug(brother);
        frekenSnork.say();
        TofslaAndWifsla TandW = new TofslaAndWifsla() {
            @Override
            public void see() {
                System.out.println(tofsla.getName() + "и " + wifsla.getName() + "посмотрели на" + brother.getName());
            }

            @Override
            public void utknylis() {
                System.out.println("уткнулись " + forehead.getName());
            }

            @Override
            public void shyshykalis(byte t) {
                if (t == 0)
                    System.out.println("и недолго шушукались");
                else System.out.println("и долго шушукались");
            }
        };
        TandW.see();
        TandW.utknylis();
        TandW.shyshykalis((byte) 1);
        wifsla.say();
        allImpl.see();
        System.out.print(likeName);
        wiz.laugh();
        System.out.print(butName);
        nb.think();
        wiz.smile();
        System.out.println(". ");
        System.out.print(now2Name);
        System.out.print(face.getName() + wiz.getName() + "a");
        face.shine(smile);
        System.out.println(". ");
        wiz.happy();
        allImpl.absSee(ears, hat, boots);
        System.out.println("! ");
        wiz.noWord(null);
        wiz.upHand(coat);
        wiz.magic();
        System.out.print(gr.getName() + againName);
        gr.shine();
        light.lighting((byte) 1, light);
        System.out.println(". ");
        place.placeing(grass,gr);
        allImpl.inFrontOf();
        king.lay(bliz);
        System.out.print(king.getName() + " - " + queen.getName());
        System.out.println("... ");
        party.starts();
        wiz.inFrontOf();
        ForestLiversImpl.Que.linedUp(que, forestLivers, 10);
        forestLivers.piz(forestLivers.they);
        forestLivers.grumble();
        forestLivers.laught();
        forestLivers.gogotali();


        AllImpl.doWish sth = () -> {
            allImpl.want();
            return "что нибудь";
        };
        System.out.println(sth.reverse() + " загадать ");


        wiz.be();
        int fe=1;
        try {
            mood.colorOfMood("радужном",forestLivers );
            fe=fe+1;
        } catch (ALotOfMagic aLotOfMagic) {
            System.out.println(aLotOfMagic.getMessage());
            fe = 0;
        } finally {
            if (fe == 2)
                forestLivers.full((byte) 1);
            }

        dance.fire(" с новой силой ");
        gr.placeing(grass,gr);

        Ops ops = new Ops("где моя тачка оладьев??");
        Bring bring = new Bring() {
            @Override
            public void bring(Wheelbarrow wheelbarrow, Pancakes pancakes, Ops ops) {
                if (wheelbarrow.getName().equals("тачку"))
                    System.out.println("выкатили " + wheelbarrow.getName() + pancakes.getName());
                else throw new Ops(ops.getMessage());
            }
        };
        bring.bring(wheelbarrow, pancakes, ops);

        hemul.boom(fireworks,"24/7");


        Book.Pereplet pereplet = new Book.Pereplet();
        mumiPapa.take(book,pereplet );
        mumiPapa.read("громко",story);
    }
    }







