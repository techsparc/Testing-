
public class AB {

    int x = 300;         //instance variable/non-static variable/global variable
   static int y = 400;  //static variable
   
  void BC() {           //non-static method 

    int z = 500;       //local variable 
    System.out.println (z);
    int a = x+z;
    int p = x*a;
    System.out.println (a);
    System.out.println ("The value of a is x+z= "+a);
    System.out.println (p);



}

   static void CD() {        //static method 

    int b = AB.y;
    System.out.println (b+y);
      
    
   


} 

    public static void main(String[] args) {
    
    AB alpha = new AB();
    alpha.BC(); //execution of metal method which is non static method
    AB.CD(); // execution of trance method which is static method

}

}

