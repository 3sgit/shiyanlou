/*  chapter 8 packages 2.5.1 example
//  inner class
*/


//Outer class
public class Food { 
   private String name = "Outer";
  
 //Inner class
    public class Apple {
      String name = "Inner";

    void stuInfo () {
      System.out.println("Access variable \"name\" in outer class: " + new Food().name);
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
    
    inner.stuInfo();
  }
}
