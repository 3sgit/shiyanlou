/*  chapter 8 packages 2.5.1 example
//  nested classes
*/

//Outer class
public class Food { 
   private String name = "Outer";
   private String id = "232_OU";
  
 //Inner class
    public class Apple {
      String name = "Inner";

    void stuInfo () {
      // access outer class property 
      System.out.println("Access variable \"name\" in outer class: " + id);
      System.out.println("Access variable \"name\" in inner class: " + this.name);
    }
   }
    
  //test inner class object  
  public static void main (String[] args) {
    
    Food outer = new Food();
    
    /* Use outer class to new a inner class object
    // [X] Apple inner = new Apple();
    */
    Apple inner = outer.new Apple();
    
    /* properties of outer class can be accessed by inner class.*/
    inner.stuInfo();
  }
}
