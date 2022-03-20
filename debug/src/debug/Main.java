 package debug;

class A {

	int sum(int a, int b) {
		return (a + b);
	}

	int sum(int a, int b, int c) {
		return (a + b + c);
	}

}

public class Main {
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.sum(10, 62));
		System.out.println(a.sum(10,10, 20));
	}
}
