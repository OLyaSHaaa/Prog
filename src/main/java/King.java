public class King extends Human {
    public King(String name) {
        setName(name);
    }


    protected void lay(Bliznez bliz) {
        bliz.getName();
        System.out.print("лежал "+ bliz.getName());
    }
}
