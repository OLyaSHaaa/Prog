public class Wifsla extends Human{
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }
    @Override
    public void say(){
        System.out.println(Th.AFTER.getName()+getName()+"торжественно произнес:");
    }
}
