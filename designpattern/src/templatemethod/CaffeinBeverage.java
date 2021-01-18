package templatemethod;

public abstract class CaffeinBeverage {
	final void prepareReciepe() {
		boilWater();
		brew();
		pourInCup();
		if(customerwantsCondiments()) {
			addCondiments();
		}
		
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("boil Water");
	}
	
	public void pourInCup() {
		System.out.println("pour In Cup");
	}
	
	public boolean customerwantsCondiments() {
		return true;
	}
}
