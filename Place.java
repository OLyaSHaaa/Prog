public class Place implements Placeing{
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }


    @Override
    public void placeing (Grass grass,Garden garden){
        System.out.print("на "+grass.getName());
    }
}
