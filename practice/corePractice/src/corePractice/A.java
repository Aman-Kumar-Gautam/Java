package corePractice;

public class A {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		A a1 = new A();
		a1.test(10,20,30,40);
	}
	
	public void test(int... x) {

		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
	}
}
