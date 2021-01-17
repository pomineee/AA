package example.polymorphism.interfacepoly;

public class InterfacePolymorphismTest {
	public static void main(String[] args) {
		Dog baduki = new Dog();
		Cat nabi = new Cat();
		Robot robo = new Robot();
		
		Animal aref = null;
		Sayable sref = null;
		Canine cref = null;
		
		aref = baduki;
		aref.say();
		aref = nabi;
		aref.say();
		//aref = robo; // robo is not animal
		//robo.say(); // can't call say() using aref
		
		sref = (Sayable) baduki;
		sref.say();
		sref = (Sayable)nabi;
		sref.say();
		sref = (Sayable)robo;
		sref.say();
		
		cref = baduki;
		cref.say();
		
		
		
		
	}
}
