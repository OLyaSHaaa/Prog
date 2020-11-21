public class Dance {
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }
    public void fire(String again){
        System.out.print(getName()+" разгорались"+again);
    }
}
