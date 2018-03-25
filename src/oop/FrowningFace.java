package oop;

class FrowningFace implements Expressions{
	public void smilingface() {
		System.out.println("Turn that frown upside down.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expressions exp = new FrowningFace();
		exp.smilingface();

	}

}
