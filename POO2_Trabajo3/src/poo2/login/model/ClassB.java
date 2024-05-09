package poo2.login.model;

public class ClassB {

	public static void main(String[] args) {
		
		ClassA ob1 = new ClassA();
		ob1.setValor(8);
		
		ClassA ob2 = ob1;
		
		ob1.setValor(6);
		
		System.out.println(ob2.getValor());
		
		// --------------------------
		
		int ab = 5;
		int bc = ab;
		
		ab = 3;
		
		System.out.println(bc);
		
	}
	
}
