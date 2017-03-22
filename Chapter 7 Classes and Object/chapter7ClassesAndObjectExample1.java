/* chapter 7 classes and object
// title 2.2
*/

public class People {
  double height;
  int age;
  int sex;
  
  void cry () {
    System.out.println("i'm crying.");
  }
  
  void laugh () {
    System.out.println("i'm laughing.");
  }
  
  void printMeInfo () {
    System.out.println("my height is " + this.height + " ." + "\n"
                       + "i'm " + this.age + " .");
    
    if () {
      System.out.println("i am a man."); 
    }
    else {
      System.out.println("i am a female."); 
    }
  }
}
