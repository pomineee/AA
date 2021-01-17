package strategy.weapon;

public class King extends Character{
	King(){
		weaponBehavior = new BowAndArrowBehavior();
	}
	@Override
	public void display() {
		System.out.println("I am a King");
	}

}
