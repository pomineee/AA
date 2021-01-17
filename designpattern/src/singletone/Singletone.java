package singletone;

public class Singletone {
	private static Singletone instance = null;
	
	public static Singletone instance() {
		if(instance == null) {
			instance = new Singletone();
		}
		return instance;
	}
}
