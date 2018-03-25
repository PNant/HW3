package oop;

public class Running extends Exercise {
	
	void jogging() {
		System.out.println("Running is fast jogging");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise obj = new Running();
		obj.jogging();
	}
}
