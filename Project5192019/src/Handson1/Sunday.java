package Handson1;

public class Sunday {


	int num;  // vvi: Default value of an instance variable is always zero.
	int c;
	int d;
	int e;
	int f;

	public void week() {

		//num= 7;
		System.out.println(num+" days in a week");
		num= 20; 
		System.out.println(num+" days in a week");	
	}
	public void days() {

		int a= 1000;
		int b = 10;
		c = a+b;
		d = a-b;
		e = a*b;
		f = a/b;


		/*
		 * int d= a*b; int e= a+b; int f= a-b;
		 */
		System.out.println(c);
		System.out.println(d); 
		System.out.println(e); 
		System.out.println(f);
		System.out.println("These are basic calculations");


	}

	public void years() {

		int a = 10;
		int b = 20;

		int c = a*b+b-a+(a*10/b); //215
		int d = a+b; //30



		//  con1     AND  con2

		// == comparison between two vars
		// && AND operations both conditions ahve to be true
		// || OR operation one of the two or more conditions has to be true.

		if (c <= 200 && d > 40) {

			System.out.println("print the value of c and that is "+c);
		} 
		else {

			System.out.println("print the value of d and that is "+d);
		}

	}

	public void decade() {

		int a= 100;
		int b= 200;

		int c= b/a; // 2
		int d= a*b; // 20000

		if (d<=22000 && c>99 && c==d) {

			System.out.println(" bla bla bla  ");
		}
		else if (d<=2000 || c>99 || c==d){ 

			System.out.println(" hahahaahah ");
		
		}else {
			System.out.println("dog");
		}

	}



}


