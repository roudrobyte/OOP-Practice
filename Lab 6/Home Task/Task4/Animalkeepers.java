package Task4;

public class Animalkeepers {
    public static int count;
    public static int workCount;
    private int id = 100;
    public String name;
    public static String [] Animals = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
    public static String[] work = new String[Animals.length];
    public static Animalkeepers[] ins = new Animalkeepers[Animals.length];

    public Animalkeepers(String nm){
        name = nm;
        count++;
        id+=count;

        System.out.println(name+" with ID "+id+" got the job!");
    }

    public void doTask(String a, String wk){
        boolean notAv = true;
        for(int i=0; i<Animals.length;i++){
            if(a.equals(Animals[i])){
                if(work[i]!=null){
                    work[i] = wk;
                    ins[i] = this;
                }
                else{
                    work[i] = wk;
                    ins[i] = this;
                    workCount++;
                }
                notAv = false;
                System.out.println("Task assigned to "+ins[i].name);
                break;
            }
        }
        if(notAv){
            System.out.println("Animal not in the Safari");
        }
    }

    public static void details(){
        if(count==0){
            System.out.println("No Animal Keepers working yet.");
            return;
        }
        System.out.println("Total Animal Keeper: "+count);
        System.out.println("Total Task assigned: "+workCount);
        printTasks();
    }

    public static void printTasks(){
        if(workCount == 0){
            System.out.println("No tasks assigned");
        }
        else{
            for(int i=0; i<Animals.length;i++){
                if(work[i]==null){
                    continue;
                }
                else{
                    System.out.println(work[i]+" (Keeper - "+ins[i].name+") === "+Animals[i]);
                }
            }
        }
    }
}
