package example.overloading;

public class Overloading {
	public void methodA(int num) {
		System.out.println("method A : " + num);
	}
	
	public void methodA(int num1, int num2) {
		System.out.println("method A : " + num1 + "," + num2);
	}
	
	public double methodA(double num) {
		System.out.println("method A : " + num);
		return num;
	}
	
	public static void main(String[] args) {
		Overloading Obj = new Overloading();
		double result;
		Obj.methodA(20);
		Obj.methodA(20, 30);
		result = Obj.methodA(5.5);
		System.out.println("Answer is : " + result);
	}
}

