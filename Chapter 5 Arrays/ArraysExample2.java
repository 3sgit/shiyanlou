/* Chapter 5 Arrays
// Exmaple 2.3
// Two-dimensonal arrays
*/

public class ArraysExample2 {
  public static void main (String[] args) {       
    String[][] name = { {"ZhaoYi", "QianEr", "SunSan"}, {"LiSi", "ZhouWu", "WuLiu"} };       
      for (int i = 0; i<name.length; i++) {
        for (int j = 0; j < name[i].length; j++) {
          System.out.println (name[i][j]);
        }
      }       
     }
  }
}
