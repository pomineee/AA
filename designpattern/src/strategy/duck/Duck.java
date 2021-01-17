package strategy.duck;

public abstract class Duck {
	FlyBehavior flyBehavior; // object composition
	QuackBehavior quackBehavior; // object composition
	
	public void performFly() {
		flyBehavior.fly(); // delegation
	}
	
	public void performQuack() {
		quackBehavior.quack(); // delegation
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys! ");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public abstract void display();
}
