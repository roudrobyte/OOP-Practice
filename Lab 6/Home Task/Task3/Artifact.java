package Task3;

public class Artifact {
    private String item;
    private String name = "Okabe";
    private static Artifact[] vault = new Artifact[4];
    private static int count;
    private static Artifact strong = new Artifact();
    private int pow ;

    public Artifact(String itNam, String nm){
        item = itNam;
        name = nm;
        pow = CalcPower();
    }

    public Artifact(String itNam){
        item = itNam;
        pow = CalcPower();
    }

    public Artifact(){

    }
    public static void AddtoVault(Artifact a){
        if(count==4){
            System.out.println("!!"+a.name+" unsuccessful in adding artifact to the vault!!");
            return;
        }
        vault[count] = a;
        count++;
        System.out.println(a.name+" added "+a.item+" successfully to the vault.");
    }

    public String GetName(){
        return item;
    }

    public int CalcPower(){
        pow = 0;
        boolean isEv = false;
        if(item.length()%2==0){
            isEv = true;
        }
        for(int i=0; i<item.length();i++){

            if(isEv){
                if(i%2==0){

                }
                else{
                 continue;
                }
            }

            else{
                if(i%2!=0){

                }
                else{
                    continue;
                }
            }
            char ch = item.charAt(i);
            int ascii = (int) ch;
            pow+=ascii;
        }
        if(strong.pow<pow){
            strong = this;
        }
        return pow;
    }

    public static String strongest(){
        return strong.item;
    }

    public void revealArtifact(){
        System.out.println(item+" added by "+name+" has power of "+pow);
    }

    public static void labReport(){
        System.out.println("=== Future Gadget Lab ===");

        for(int i=0; i<count; i++){
            System.out.println(vault[i].item+" added by "+vault[i].name+" has power of "+vault[i].pow);
        }
    }

    public void changeName(String nm){
        item = nm;
        pow = CalcPower();
        System.out.println("Name changed and power recalculated.");
    }
}