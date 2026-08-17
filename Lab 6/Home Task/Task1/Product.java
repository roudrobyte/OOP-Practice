package Task1;

public class Product {
    public String name;
    public int num;
    public static int count = 0;
    public static Product[] arr = new Product[3];

    public Product(String nm, int nb){
        if(count>=3){
            System.out.println("Storage is full! Cannot add "+nm);
            return;
        }
        name = nm;
        num = nb;
        arr[count] = this;
        count++;
        System.out.println("Stored: "+nm);
    }

    public static void displayProducts(){
        System.out.println("=== Stored Products ===");
        for(int i=0; i<count;i++){
            System.out.println(arr[i].name+" - Qty: "+arr[i].num);
        }
    }

    public static void buy(String nm, int nb){
        int temp = 0;
        boolean isAv = false;
        for(int i=0; i<count; i++){
            if(arr[i].name.equals(nm)){
                isAv = true;
                temp = i;
            }
        }

        if(isAv){
            if(arr[temp].num>nb){
                arr[temp].num-=nb;
                System.out.println("Product Sold");
            }
            else{
                System.out.println("Quantity low");
            }
        }

        else{
            System.out.println("Product not found");
        }
    }
}
