package example.polymorphism.abstractclass;

public class AbstractPolymolphismTest {
	public static void main(String[] args) {
		Animal animal = null;
		Dog baduki = new Dog();
		Cat nabi = new Cat();
		
		animal = baduki;
		animal.say();
		
		animal = nabi;
		animal.say();
		
		animal = new Cat();
		animal = new Dog();
		Canine canine = new Dog();
	}
}
