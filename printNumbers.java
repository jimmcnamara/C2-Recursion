
public class printNumbers {

	public static void main(String[] args) {
		// Call method
		upToNumber(15);
		
		//Call class method
		Counter myCounter = new Counter();
		myCounter.upToNumber(21);
		
		System.out.println("Class method 'upToNumber' has been called " + Counter.noTimes + " times.");
		
	}
	
	public static void upToNumber(int number)
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
	}

}