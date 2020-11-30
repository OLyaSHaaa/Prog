public class Face implements IShine{
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }
    @Override
    public void shine(Smile smile) {
     smile.getName();
        System.out.print( " просияло" + smile.getName());
    }
}
