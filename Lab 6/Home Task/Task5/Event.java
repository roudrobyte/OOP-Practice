package Task5;

public class Event {
    public static int count;
    public static Event[] list = new Event[5];
    private String name;
    public String date;

    public Event(String nm, String dt){
        if(count==5){
            return;
        }
        name = nm;
        date = dt;
        list[count] = this;
        count++;
    }

    public String getName(){
        return name;
    }

    public String details(){
        return "Name: "+name+" \nDate: "+date;
    }

    public static void allEventInfo(){
        System.out.println("Total Events: "+count);
        System.out.println("Event Details: ");
        for(int i=0; i<count;i++){
            System.out.println("Event "+(i+1)+":");
            System.out.println(list[i].details());
        }
    }
}
