import java.util.Objects;

public class Book {
        private String Name;
        public void setName(String name) {
            this.Name = name;
        }
        public String getName() {
            return this.Name;
        }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        if (this == obj)
            return true;
        Book other = (Book) obj;
        return Objects.equals(Name, other.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }

    @Override
    public String toString() {
        return this.Name;
    }

    public static class Pereplet{
            private static String Name;
            public void setName(String name) {
                Name = name;
            }
            public String getName() {
                return Name;
            }
            public static void value(int v){
                if (v>100){
                    Book.Pereplet.Name = " в роскошном переплете ";
                    System.out.print(Book.Pereplet.Name);}
                else {Book.Pereplet.Name = " в ветхом переплете ";
                    System.out.print(Book.Pereplet.Name);}

            }
        }
}
