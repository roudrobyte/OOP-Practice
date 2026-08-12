public class Account {
    public static String bankName = "Badda Bank";
    public static int count = 0;
    public static double totalBalance;
    public String name;
    private double balance;
    public String location;
    
    public Account(String nm, String loc){
        name = nm;
        location = loc;
        count++;
    }
    
    public void setBalance(double bl){
        balance+=bl;
        totalBalance+=bl;
    }
    
    public double getBalance(){
       return balance;
    }
    
    public void printInfo(){
        System.out.println("Name: "+name+", address: "+location);
        System.out.println("Balance: "+ balance);
    }
}
        
    