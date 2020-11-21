//import com.sun.tools.javac.Main;

import java.util.Objects;

public abstract class Human {
    private String Name;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }
    public static String someOne(){ return "кто-нибудь";}
    public void say(){}
    public void think() {}
    void inFrontOf(){}
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        if (this == obj)
            return true;
        Human other = (Human) obj;
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

    public static class Mood{
        private String Name;
        public void setName(String name) {
            this.Name = name;
        }
        public String getName() {
            return this.Name;
        }
        public void colorOfMood(String s,ForestLiversImpl forestLivers) throws ALotOfMagic{
            if (s.equals("плохом")){
                throw new ALotOfMagic ("в "+s+getName()+" и "+MagicManImpl.wizName()+" не исполнял желания");
            }
            else if (s.equals("радужном")){
                System.out.print("в "+s+getName()+" и если "+someOne());
                }
                else
                {
                    s="странном";
                    System.out.print("в "+s+getName()+" и если "+someOne());
                   forestLivers.full((byte) 0);
            }
            }
        }
    }
