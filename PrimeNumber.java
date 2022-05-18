package week1.day1;

public class PrimeNumber {

   public static void main(String[] args) 
	{
		int input = 13;
		boolean flag = false;
		for(int i =2; i<=input/2;i++)
		{
			int b = input% i;
					if(b==0)
						
					flag=true;
		}
		if(flag) {
			
		
		System.out.println("It is not a prime number");
			
}
	else
	{
			System.out.println("It is a prime number");
	}

	
	}
}
	


