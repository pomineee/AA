package example.overriding;

public class OverridingTest {
	public static void main(String[] args) {
		Parent obj1 = new Parent();
		Parent obj2 = new Child();
		obj1.methodA();
		obj2.methodA();
	}
}
