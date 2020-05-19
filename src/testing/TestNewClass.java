package testing;


class Test{
	int x;
	Test(int i){
		x = i;
	}
	Test(){
		x = 0;
	}
}



public class TestNewClass {
	
	
	public static void main(String[] args) {
		Test t = new Test(5);
		change(t);
		System.out.println(t.x);
	}
	
	
	public static void change(Test t) {
		t = new Test();
		t.x = 10;
	}

}
