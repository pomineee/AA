package example.polymorphism.interfacepoly;

public class Robot implements Sayable{
	
	private void printOut() {
		System.out.println("Robo : printOut");
	}
	@Override
	public void say() {
		printOut();
	}

}
