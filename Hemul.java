public class Hemul extends Human {
    public Hemul(String name) {
        setName(name);
    }
    public void boom(Fireworks fireworks,String lasts){
        class Time{
            public Time() {
            }
        }
        if ( lasts=="24/7")
            System.out.println(getName()+lasts+" бабахал " +fireworks.getName());
        else System.out.println(getName()+" с перерывами на еду бабахал "+fireworks.getName());
    }
}
