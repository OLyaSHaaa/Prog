public class ForestLiversImpl implements ForestLivers{
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }
    final String they="они";
    @Override
    public void piz(String they) {
        System.out.print(they+" пищали, ");
    }

    @Override
    public void laught() {
        System.out.print("смеялись, ");
    }

    @Override
    public void grumble() {
        System.out.print("ворчали, ");
    }

    @Override
    public void gogotali() {
        System.out.println("и гоготали");
    }

    public static class Que{
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }
        public static void linedUp(Que que,ForestLiversImpl forestLivers,int l){
            if (l>5)
                System.out.println(" выстроилась длинная "+que.getName()+forestLivers.getName());
            else System.out.println(" выстроилась не очень длинная "+que.getName()+forestLivers.getName());
        }}
    @Override
    public void full(byte f){
            if (f==1){
                System.out.print(" загадывал глупое желание "+MagicManImpl.wizName());
                MagicManImpl.reWish();}
            else {
                System.out.println(" загадывал хорошее желание "+MagicManImpl.wizName());
                MagicManImpl.makeWish();
            }

            }

    }


