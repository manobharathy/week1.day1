package week1.day1;

public class Factorial {
	
   public static void main(String[] args) 
   {
	   int start = 1;
	   int numberOfTime = 5;
	   int fact = 1;		   
	   for(start = 1; start<=numberOfTime; start++) {
		   fact = fact * start;	   
	   }
	   System.out.println(fact);
	} 
}

