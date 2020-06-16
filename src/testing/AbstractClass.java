package testing;

abstract class A{
	
	static int nMethod(int a, int b) {
		return a+b;
	}
}

class B extends A{
	
}



public class AbstractClass {
	
	
	public static void main(String[] args) {
		B a = new B();
		System.out.println(B.nMethod(3,5));
		
	}

}
