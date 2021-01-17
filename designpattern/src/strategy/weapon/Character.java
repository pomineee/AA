package strategy.weapon;

public abstract class Character {
	WeaponBehavior weaponBehavior;
	
	public void fight() {
		weaponBehavior.useWeapon();
	}
	
	public void setWeapon(WeaponBehavior wb) {
		weaponBehavior = wb;
	}
	
	public abstract void display();
}
