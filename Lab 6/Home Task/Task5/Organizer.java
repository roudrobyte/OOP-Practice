package Task5;

public class Organizer {
    public String name;
    public Event [] arr = new Event[4];
    public int count;
    public Organizer() {
        System.out.println("Please provide the organizer's name");
    }
    public Organizer(String nm) {
        name = nm;
    }

    public void organizeEvent(Event a){
        if(count==4){

        }
        else{
            arr[count] = a;
            count++;
            System.out.println(name+" successfully organized "+a.getName());
        }
    }

    public void searchEventByDate(String dt){
        boolean isAv = true;
        for(int i=0; i<count;i++){
            if(arr[i].date.equals(dt)){
                System.out.println(arr[i].getName());
                isAv = true;
                break;
            }
            else{
                isAv = false;
            }
        }
        if(!isAv){
            System.out.println("No event is scheduled for "+dt);
        }
    }
}
