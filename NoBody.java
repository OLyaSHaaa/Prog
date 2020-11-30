public class NoBody extends Human {
    public NoBody(String name) {
        setName(name);
    }

    @Override
    public void think() {

            System.out.print(getName()+"не мог подумать, что ");
    }
}

