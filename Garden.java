public class Garden extends Place {
    private String Name;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    public void shine() {
        System.out.print(" озарился");
    }

    @Override
    public void placeing(Grass grass,Garden garden){
        System.out.print("в "+garden.getName());

}
}
