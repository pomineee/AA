package strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Duck mallardDuck =  new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.display();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
