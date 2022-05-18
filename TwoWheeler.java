package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 123456;
	boolean isPunchred = true;
	String bikeName = "fz";
	double runningKM = 45.6;	
	int regNumber = 12345;
     
	public void wheels() {	
		
		System.out.println("noOfWheels = " + noOfWheels);	
		System.out.println("noOfMirrors = "+ noOfMirrors);
		System.out.println("chassisNumber = " + chassisNumber);
		System.out.println("isPunchred = " + isPunchred);
		System.out.println("bikeName = " + bikeName);	
		
	} 
	public static void main(String[] args) {
		System.out.println("My two wheeler");
		TwoWheeler obj = new TwoWheeler();
			obj.wheels();
		
	}
}

		
