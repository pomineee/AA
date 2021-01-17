package strategy.weapon;

public class WeaponTest {
	public static void main(String[] args) {
		Character who = new King();
		who.display();
		who.fight();
		who.setWeapon(new SwordBehavior());
		who.fight();
	}
}
