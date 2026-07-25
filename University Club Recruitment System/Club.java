public class Club{
  private String name;
  private double minCg;
  private int minCrd;
  private int maxMem;
  private String dept;
  
  public Club(String nm, int crd, double cg, int mem){
    name = nm;
    minCrd = crd;
    minCg = cg;
    maxMem = mem;
  }
  
  public String getName(){
    return name;
  }
  
  public double getCg(){
    return minCg;
  }
  public int getMem(){
    return maxMem;
  }
}
  
  