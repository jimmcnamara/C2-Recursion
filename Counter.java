
public class Counter {
	
	public static int noTimes = 0;
	
	public void upToNumber(int number)
	{
		if (number == 0)
		{
			System.out.println(number);
		}
		else
		{
			System.out.println(number);
			upToNumber(--number);
			
		}
		
		noTimes++;
	}

}
