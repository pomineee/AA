package templatemethod;

public class Coffe extends CaffeinBeverage{

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	
	public boolean customerwantsCondiments() {
		String answer = "N";
		if(answer.startsWith("Y")) {
			return true;
		}
		return false;
	}

}
