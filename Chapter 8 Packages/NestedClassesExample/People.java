/* chapter 8 packages 2.5.2 example
// Nested classes are divided into two categories:
//    1) static 2) non-static
// Neested class are declared static are called static nested classes, 
// Non-static classes are called inner classes.
// http://stackoverflow.com/questions/1353309/java-static-vs-non-static-inner-class
*/
package InnerClassesExample;

public class People {
  private String name = "Level 3";
  static String ID = "005235";
  
    class Student {
      private String name = "Level 1";
      String ID = "128923";
      
      //
      void stuInfo() {
        System.out.printf("father class.name = %s\nfather class.ID = %s",People.name, People.ID );
      }
    }

    static class Teacher {
      private String name = "Level 2";
      
      void stuInfo () {
      }
    }

}

class test {
  public static void main (String[] args) {
    Student st1 = new Student();
    st1.stuInfo();
  }
}
