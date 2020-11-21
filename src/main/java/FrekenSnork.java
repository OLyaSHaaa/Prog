public class FrekenSnork extends Human implements IShine {
    public FrekenSnork(String name) {
        setName(name);

    }


    @Override
    public void say(){
        System.out.println("и сказала:");
}

    public void see(Mirow mirow) {

        System.out.println(getName() + Th.AGAIN.getName() + " посмотрела в " + mirow.getName());

    }

    public void cryLoud(String wow) {
        System.out.println(getName() + "вскрикнула " + wow);
    }

    public class Eyes {
        private final String eyes;
        public Eyes() {
            eyes = "глазки ";
        }
        public String nice() {
            return " умилительные ";
        }
        public void go(String be) throws EyesOnPlace {
            if (be == null) {
                throw new EyesOnPlace(nice() + eyes + getName() + "не были на месте");
            }
            System.out.println(nice() + eyes + getName() + Th.AGAIN.getName() + be);
        }

    }
    @Override
    public void shine(Smile smile) {
        System.out.print(" сияя" + smile.getName());
    }
    public void hug(Brother brother){
        System.out.println(getName() + " обняла " + brother.getName());
    }
}


