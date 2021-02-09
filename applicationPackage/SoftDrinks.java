package applicationPackage;

public class SoftDrinks 
{
	public SoftDrinks(String eventType, String packageType)
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
		System.out.println();
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi for refreshment.");
				break;
			case "Wedding":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
			case "Social":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi for refreshment.");
				break;
			case "Kids":
				System.out.println("SOFT DRINKS : You will be offered with Maza and Appy for refreshment.");
				break;
			case "Birthday":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
		}
		System.out.println("________________________________________________________________________________________________________________________________");
	}
	public static void Gold(String eventType) 
	{
		System.out.println();
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi for refreshment.");
				break;
			case "Wedding":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
			case "Social":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi for refreshment.");
				break;
			case "Kids":
				System.out.println("SOFT DRINKS : You will be offered with Maza and Appy for refreshment.");
				break;
			case "Birthday":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
		}
		System.out.println("________________________________________________________________________________________________________________________________");
	}
	public static void Platinum(String eventType) 
	{
		System.out.println();
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
			case "Wedding":
				System.out.println("SOFT DRINKS : You will be offered with Sprite, Pepsi and Appy for refreshment.");
				break;
			case "Social":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi for refreshment.");
				break;
			case "Kids":
				System.out.println("SOFT DRINKS : You will be offered with Maza and Appy for refreshment.");
				break;
			case "Birthday":
				System.out.println("SOFT DRINKS : You will be offered with Pepsi and Appy for refreshment.");
				break;
		}
		System.out.println("________________________________________________________________________________________________________________________________");
	}
}
