// Chapter 6 method assignment
public class chapter6MethodAssignment1 {
  public static void main (String[] args) {
    
    apple a1 = new apple();
    a1.m1(5);
  }
}

class apple {
  public void m1 (int n) {   
    int count = 0;
      for (int i=0; i<=n; i++) { 
        for (int j=0; j<i; j++) {
        ++count;
        System.out.printf("%02d ", count); 
        }
       System.out.println();
      }
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
