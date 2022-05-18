package week1.day1;

public class Fibonacci {
			
	public static void main(String[] args) {
		int firstnum = 0;
		int secondnum = 1;
		int range = 8;
		int sum;
		
		System.out.println(firstnum);
		System.out.println(secondnum);

		for(int i = 0; i< range ; i++) {
			sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
			System.out.println(sum);
		}
		
	}
}