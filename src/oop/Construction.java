package oop;

public class Construction {
	String foundation;
	String roof;
	String wood;
	
	public void BuildingAHouse() {
		foundation = concrete();
		roof = modern();
		materials = wood();
		
		System.out.println("The foundation will be made from " + foundation);
		System.out.println("The roof design will be " + roof);
		System.out.println("The house material will be " + materials);
	}
	
	public int BuildingAHouse(int length, int width, int height) {
		return length*width*height();
	}

}
