/* chapter 5 Arrays assignment
// To print from 1 to 100 by using Arrays
*/
public class arraysAssignment1 {
  public static void main (String[] args) { 
  
    int num[][] = new int[10][10];
    int count = 0;
    
      for (int i=0; i<num.length; i++) {
        for (int j=0; j<num[i].length; j++) {
          ++count;
        //System.out.printf("%d%s", num[i][j], "\t");
          System.out.printf("%3d", num[i][j]);
          }
          System.out.println();  
        }
      }
    
  }
}
