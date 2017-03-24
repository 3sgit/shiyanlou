/* chapter 8 packages 2.5.2 example
// static nested class vs non-static nested class 
// http://stackoverflow.com/questions/1353309/java-static-vs-non-static-inner-class
*/
package InnerClassesExample;

public class People {
  static String ID = "005235";
  
    class Student {
      String ID = "128923";
      
      void stuInfo() {
        System.out.printf("father class.ID = ",new People().ID );
      }
    }

    static class Teacher {

    }

}

class test {
  public static void main (String[] args) {
    Student st1 = new Student();
    st1.stuInfo();
  }
}
