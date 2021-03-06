/*  chapter 8 packages
//  inner class
*/
package InnerClassesExample;

//Outer class
public class Food { 
  private String name = "Outer";
  
 //Inner class
    public class Apple {
      String name = "Inner";

    void stuInfo () {
      System.out.println("Access variable "name" in outer class: " + super.name);
      System.out.println("Access variable "name" in inner class: " + this.name);
    }
   }
    
  //test inner class object  
  public static void main (String[] args) {
    Food outer = new Food();
    Apple inner = new Apple();
    
    inner.stuInfo();
  }
}
