public class Trainer{
    public static int count;
    public String name;
    public int id;
    public Pokemon[] arr = new Pokemon[7];
    public int count1;
    
    public Trainer(String nm){
        name = nm;
        count++;
        id = count;
        System.out.println("Trainer ID: "+id+", Name: "+name+" - created");
    }
    public double getAverage(){
        double sum  = 0;
        double average = 0;
        for(int i=0; i<count1;i++){
            sum+=arr[i].getHP();
        }
        average = sum/count1;
        return average;
    }
    public void catchPokemon(Pokemon a){
        if(count1==7){
            return;
        }
        else{
            arr[count1] = a;
            System.out.println(name+" caught: "+a.getName());
            count1++;
        }
    }
    
    public void viewPokeDex(){
        System.out.println(name+"'s Trainer code: "+"T"+id);
        
        for(int i=0; i<count1;i++){
            System.out.println(arr[i].getName()+": "+arr[i].getHP()+" points");
        }
        System.out.println("Average of HP: "+getAverage());
    }
    
    public static void battle(Trainer a, Trainer b){
        System.out.println("Battle Info");
        System.out.println(a.name+"'s HP average: "+a.getAverage());
        System.out.println(b.name+"'s HP average: "+b.getAverage());
        
        if(a.getAverage()>b.getAverage()){
            System.out.println(a.name+" wins");
        }
        else{
            System.out.println(b.name+" wins");
        }
    }
}
    
    
    
    
    