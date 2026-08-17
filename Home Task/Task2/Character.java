package Task2;

public class Character {
    public static int count = 0;
    public static int kid = 0;
    public static int teen = 0;
    public static int adults = 0;
    public static int totalHealth = 0;
    public static Character max = new Character();
    public String name;
    public int health;
    public int id;
    public String group;
    public static double avHealth;

    public Character(){

    }
    public Character(String nm, String grp,int hlt){
        name = nm;
        health = hlt;
        totalHealth+=hlt;
        count++;
        id = count;
        group = grp;

        if(grp.equals("Kid")){
            kid++;
        }
        else if(grp.equals("Adult")){
            adults++;
        }
        else{
            teen++;
        }

        if(hlt>max.health){
            max = this;
        }
    }

    public Character(String nm, int hlt){
        this(nm, "Teen",hlt);
    }

    public void printDetails(){
        System.out.println("ID: "+id+", Name: "+name);
        System.out.println("Group: "+group);
        System.out.println("Health: "+health);
    }

    public static void printStats(){
        System.out.println("Total Characters: "+count);
        System.out.println("Kids: "+kid);
        System.out.println("Teens "+teen);
        System.out.println("Adults: "+adults);

        if(count>0) {
            avHealth = totalHealth / count;
        }

        System.out.println("Average Health: "+avHealth);
        System.out.print("Strongest Character: ");

        if(max.name != null){
            System.out.println(max.name+" (Health "+max.health+")");
        }

        else{
            System.out.println("None");
        }
    }


}
