/* chatper 7 classes and object
// here is an example of constructor in JAVA.
*/

public class ConstructorExample1 {
  //People
  int age;
  int sex;
  String name;
  
  public static void main (String[] args) {
    ConstructorExample1 test = new ConstructorExample1(10, 0, "Tim");
  }
  
  ConstructorExample1 () {
    //nil 
  }
  
  ConstructorExample1 (int age, int sex, String name) {
    this.age = age;
    this.sex = sex;
    this.name = name;
  }
}
