public class Light {
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }
    public void lighting (byte a, Light light){
        light.getName();
        if (a == 1)
            System.out.print(" ярким"+ light.getName());
        else System.out.print(" тусклым"+ light.getName());
    }
}
