public class MagicManImpl extends Human implements Wizard {
    public MagicManImpl(String name) {
        setName(name);
    }
    public static String wizName(){ return "Волшебник";}
    public static void reWish(){
        System.out.println(" разрешал перезагадывать");
    }
    public  static void makeWish(){
        System.out.println(" выполнял его");
    }
    @Override
    public void laugh() {
        System.out.print(getName()+ " хохотал");
    }

    @Override
    public void smile() {
        System.out.print(getName()+ " может улыбаться");
    }

    @Override
    public void happy() {
        System.out.print(getName()+ " был так счастлив");
    }

    @Override
    public void noWord(String str) {
        if (str==null)
            System.out.print("не сказав не слова ");
        else System.out.print(str);
    }

    @Override
    public void upHand(Coat coat) {
        System.out.print(getName()+ " взмахнул "+ coat.getName());
    }
    @Override
    public void magic() {
        System.out.print(", и --" +" вот нате! "+"--");
    }
    @Override
    public void inFrontOf(){
        System.out.println("перед "+ getName()+"ом");
    }
    public void be(){
        System.out.print(getName()+" был ");
    }
}

