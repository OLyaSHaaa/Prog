public class EyeLashes {
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }
    public void stay(String tall) {
        if (tall.equals("чуточку"))
            System.out.println(getName()+"стали " + tall + " длинее");
        else if (tall.equals("намного"))
            System.out.println(getName()+"стали " + tall + " длинее");
        else System.out.println(getName()+"не стали длинее");
    }
}
