public class Student{
    public static int total_students;
    public static double average;
    public static double total=0;
    public String name;
    public int id;
    public int codingMark;
    public int tracingMark;
    public int totalMarks;
    public Student(String nm){
        name = nm;
        total_students++;
        id = total_students;
    }
    
    public Student(String nm, int m1, int m2){
        this(nm);
        codingMark = m1;
        tracingMark = m2;
    }
    
    public void setCodingMarks(int a){
        codingMark = a;
    }
    
    public void setTracingMarks(int b){
        tracingMark = b;
    }
    
    public void individualDetail(){
        System.out.println("Name: "+name);
        System.out.println("ID "+id);
        System.out.println("Coding Marks: "+codingMark);
        System.out.println("Tracing Mark: "+tracingMark);
        totalMarks = tracingMark + codingMark;
        total+=totalMarks;
        if(totalMarks>50){
            System.out.println(name+" has passed with "+totalMarks+" marks");
        }
        else{
            System.out.println(name+" has failed with "+totalMarks+" marks");
        }
    }
    
    public static double averageMarks(){
        if(total_students==0){
            return 0.0;
        }
        average = total/total_students;
        return average;
    }
}
    