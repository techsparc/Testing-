
public class music {

	     int a = 33;         //instance variable/non-static variable/global variable
	    static int b = 44;  //static variable
	    
	   void metal() {           //non-static method 

	     int c = 55;       //local variable 
	     System.out.println (c);
	     double d = c/a;
	     System.out.println (d);
	     System.out.println ("The value of a is c/a= "+d);



	}

	    static void trance() {        //static method 

	     int e = music.b;
	     System.out.println (e);


	} 

	     public static void main(String[] args) {
	     
	     music homework1 = new music();
	     homework1.metal(); //execution of metal method which is non static method
	     music.trance(); // execution of trance method which is static method

	}

	}
