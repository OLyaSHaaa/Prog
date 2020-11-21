public class Party {
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }
    public void starts(){
        System.out.println("Тут уж пошло "+getName()+" так "+getName());
    }
}
