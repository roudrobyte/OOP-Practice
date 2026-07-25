public class BRACUTester { 
    public static void main(String[] args) { 
        Club bucc = new Club("BUCC", 15, 3.0, 3); 
        Club robotics = new Club("Robotics Club", 20, 2.8, 2); 
        
        System.out.println("Total Recruits: " + Student.getTotalRecruits()); 
        
        Student s1 = new Student("ROUDRO", 45, 3.5, "CSE", "Research and Development"); 
        
        System.out.println("1=========================="); 
        s1.joinClub(bucc); 
        System.out.println("2=========================="); 
        s1.joinClub(robotics); 
        System.out.println("3=========================="); 
        s1.showDetails(); 
        
        Student s2 = new Student("Sara", 30, 3.8, "BBA", "Research and Development"); 
        System.out.println("4=========================="); 
        s2.joinClub(bucc); 
        
        Student s3 = new Student("Ahnaf", 12, 0.0, "EEE", "Hardware"); 
        System.out.println("5=========================="); 
        s3.joinClub(bucc); 
        
        Student s4 = new Student("Alen", 10, 2.5, "Executive"); 
        System.out.println("6=========================="); 
        s4.joinClub(bucc); 
        s4.showDetails(); 
        
        System.out.println("7=========================="); 
        Student s5 = new Student("Afrida", 60, 3.9, "CSE", "General"); 
        s5.joinClub(bucc); 
        
        System.out.println("8=========================="); 
        System.out.println("Total Recruits: " + Student.getTotalRecruits()); 
    } 
}
