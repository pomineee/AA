package example.polymorphism.abstractclass;

public class Cat extends Animal{
	private void meow() {
		System.out.println("cat : meow");
	}
	@Override
	public void say() {
		meow();
	}
}
