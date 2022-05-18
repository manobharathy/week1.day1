package week1.day1;

public class Car {
	
	public void applyBreak() {
		System.out.println("1.applyBreak");		
	}
	
	public void applyGear() {		
		System.out.println("2.applyGear");
	}
	
    public void switchOnAc() {
    	System.out.println("3.switchOnAc");
	}
    
   public void applyAcclerate() {
	   System.out.println("4.applyAcclerate");
  	}
   
	public static void main(String[] args) {
		System.out.println("car methods");

		Car mycar = new Car();
		mycar.applyBreak();
		mycar.applyGear();
		mycar.switchOnAc();
		mycar.applyAcclerate();
	}

}
