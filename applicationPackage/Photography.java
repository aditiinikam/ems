package applicationPackage;

public class Photography 
{
	public Photography(String eventType, String packageType)
	{
		if(packageType.equalsIgnoreCase("Silver"))
		{
			Silver(eventType);
		}
		else if(packageType.equalsIgnoreCase("Gold"))
		{
			Gold(eventType);
		}
		else if(packageType.equalsIgnoreCase("Platinum"))
		{
			Platinum(eventType);
		}
	}
	public static void Silver(String eventType) 
	{
		System.out.print("\nPHOTOS: ");
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("You will get 50 photo copies of the event.");
				break;
			case "Wedding":
				System.out.println("You will get 200 photo copies of the event.");
				break;
			case "Social":
				System.out.println("You will get 50 photo copies of the event.");
				break;
			case "Kids":
				System.out.println("You will get 50 photo copies of the event.");
				break;
			case "Birthday":
				System.out.println("You will get 50 photo copies of the event.");
				break;
		}
		System.out.println("________________________________________________________________________________________________________________________________");
	}
	public static void Gold(String eventType) 
	{
		System.out.print("\nPHOTOS: ");
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("You will get 100 photo copies of the event.");
				break;
			case "Wedding":
				System.out.println("You will get 250 photo copies of the event.");
				break;
			case "Social":
				System.out.println("You will get 100 photo copies of the event.");
				break;
			case "Kids":
				System.out.println("You will get 100 photo copies of the event.");
				break;
			case "Birthday":
				System.out.println("You will get 100 photo copies of the event.");
				break;
		}
		System.out.println("________________________________________________________________________________________________________________________________");
	}
	public static void Platinum(String eventType) 
	{
		System.out.print("\nPHOTOS: ");
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("You will get 200 photo copies of the event.");
				break;
			case "Wedding":
				System.out.println("You will get 500 photo copies of the event.");
				break;
			case "Social":
				System.out.println("You will get 300 photo copies of the event.");
				break;
			case "Kids":
				System.out.println("You will get 500 photo copies of the event.");
				break;
			case "Birthday":
				System.out.println("You will get 500 photo copies of the event.");
				break;
		}
		System.out.println("________________________________________________________________________________________________________________________________");
	}
}
