package Week1.Day1;

public class Factorial {
	
	public static void main(String[] args) {
		
	int count=6, factorial=1;
	for(int i=1;i<=count;i++)
	{
		factorial=factorial*i;
	}
	System.out.println("factorial of "+ count +" is : "+factorial);
	}

}
