public class MumiPapa extends Human {
    public MumiPapa(String name) {
        setName(name);
    }
    public void take(Book book,Book.Pereplet pereplet){
        System.out.print(getName()+" вынес "+book.getName());
        Book.Pereplet.value(101);
    }
    StoryAbout youth = new StoryAbout() {
        @Override
        public void about(Story story) {
            System.out.print(story.getName()+" о своем детстве ");
        }
    };
    public void read(String loud,Story story){
        System.out.print(" и зачитывал");
            if (loud!=null)
                System.out.print(" вслух ");
            else System.out.print(" сам для себя");
        youth.about(story);

    }
}


