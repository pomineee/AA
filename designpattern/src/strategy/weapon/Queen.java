package strategy.weapon;

public class Queen extends Character{
	Queen(){
		weaponBehavior = new KnifeBehavior();
	}
	@Override
	public void display() {
		System.out.println("I am a Queen");
	}

}
