// Chapter 6 method assignment
public class chapter6MethodAssignment1 {
  public static void main (String[] args) {
    
    int n = 5;
    int count = 0;
    for (int i=0; i<=n; i++) { 
      for (int j=0; j<i; j++) {
      ++count;
      System.out.printf("%02d ", count); 
      }
     System.out.println();
    }
  }
  
  public int (n) {
     
  }
}

/*
Print out:
01 
02 03 
04 05 06 
07 08 09 10 
11 12 13 14 15 
*/
