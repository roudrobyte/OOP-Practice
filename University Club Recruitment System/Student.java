public class Student{
  public String name;
  public double cg;
  public int crd;
  public String dept = "CSE";
  public String wing = "General";
  public static int total;
  public boolean jClub = false;
  public Club st;
  public String id;
  public boolean fresher;
  public int mem = 0;
  
  public String createId(){
    return dept+"-"+name+"-"+crd;
  }
  public Student(String nm, int cred, double cgp, String dept, String wing){
    name = nm;
    crd = cred;
    cg = cgp;
    if((crd<15)||(cg==0.0)){
      fresher = true;
    }
    this.dept = dept;
    this.wing = wing;
  }
  
  public Student(String nm, int cred,double cgp, String wing){
    this(nm, cred, cgp, "CSE", wing);
  }
    
    
  public static int getTotalRecruits(){
    return total;
  }
  
  public void joinClub(Club a){
    if(mem==a.getMem()){
      System.out.println("Sorry, "+name+" "+a.getName()+" has reached its maximum capacity of "+a.getMem()+" members.");
      return;
    }
    if(jClub){
      System.out.println("Sorry "+name+", you are already registered to "+st.getName());
      return;
    }
    if(fresher){
      this.fresherTag(a);
      return;
    }
    
    if(wing.equals("Executive")){
      System.out.println(name+" successfully joined "+a.getName()+" in the "+wing);
      System.out.println("(Execuive override applied)");
      total++;
      jClub = true;
      st = a;
      id = this.createId();
      return;
    }
      
    if(a.getCg()<=cg){
      if(wing.equals("Research and Development") && ((dept.equals("CSE")||dept.equals("EEE")))){
        System.out.println(name+" successfully joined "+a.getName()+" in the "+wing);
        total++;
        jClub = true;
        st = a;
        id = this.createId();
      }
      else{
        System.out.println("Sorry "+name+", only CSE or EEE students can join the "+wing+" wing.");
      }
    }
    else{
    }
  }
  
  public void showDetails(){
    System.out.println("ID: "+id+", Name: "+name+", Dept: "+dept);
    System.out.println("Club: "+st.getName()+", Wing: "+wing+", Status: Active Member");
  }
  
  public void fresherTag(Club b){    
    st = b;    
    System.out.println(name+" successfully joined "+st.getName()+" in the "+wing);
        System.out.println("(Fresher CGPA Bypass applied)");
        total++;
        jClub = true;
        
        id = this.createId();
  }
}
  
                                                     

                        
                                                                                                                                                    
                                                     
                                                     
                                                     
                                       
                                                     
                                                     
                                                     