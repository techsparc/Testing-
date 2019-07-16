package calculator;

public class execution {
	
	public static void main(String[] args) {
		
		data i = new data();
		
		
		int z= i.add(10, 100); 
		System.out.println(z);
		System.out.println(i.add(200, 9050));
		
		int x= i.multiply(10, 100); 
		System.out.println(x);
		
		double c= i.divide(5, 4); 
		System.out.println(c);
		
		int v= i.subtract(10, 100); 
		System.out.println(v);
	
	}

}
