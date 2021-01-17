package example.polymorphism.interfacepoly;

public class Cat extends Animal implements Sayable{
	
	private void meow() {
		System.out.println("cat : meow");
	}
	@Override
	public void say() {
		meow();
	}
}
