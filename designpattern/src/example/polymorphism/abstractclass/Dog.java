package example.polymorphism.abstractclass;

public class Dog extends Canine{
	private void bark(){
		System.out.println("dog : bark");
	}
	@Override
	public void say() {
		bark();
	}
}
