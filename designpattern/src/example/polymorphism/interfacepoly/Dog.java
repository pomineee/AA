package example.polymorphism.interfacepoly;

public class Dog extends Canine implements Sayable{
	
	private void bark() {
		System.out.println("Dog : bark");
	}
	@Override
	public void say() {
		bark();
	}

}
