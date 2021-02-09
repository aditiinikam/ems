package applicationPackage;

public class Snacks
{ 

	public Snacks(String eventType, String packageType)
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
				System.out.println("SNACKS : You will get samosas and cheese chilly toast for snacks.");
				break;
			case "Wedding":
				System.out.println("SNACKS : You will get samosas and cheese chilly toast for snacks.");
				break;
			case "Social":
				System.out.println("SNACKS : You will get burgers and cheese chilly toast for snacks.");
				break;
			case "Kids":
				System.out.println("SNACKS : You will get samosas and cheese chilly toast for snacks.");
				break;
			case "Birthday":
				System.out.println("SNACKS : You will get cheesy fries and pizza for snacks.");
				break;
		}
	}
	public static void Gold(String eventType) 
	{
		System.out.println();
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("SNACKS : You will get samosas and cheese chilly toast for snacks.");
				break;
			case "Wedding":
				System.out.println("SNACKS : You will get cheesy fries and cheese chilly toast for snacks.");
				break;
			case "Social":
				System.out.println("SNACKS : You will get pizza and cheesy fries for snacks.");
				break;
			case "Kids":
				System.out.println("SNACKS : You will get samosas and cheese chilly toast for snacks.");
				break;
			case "Birthday":
				System.out.println("SNACKS : You will get burger and samosa for snacks.");
				break;
		}
	}
	public static void Platinum(String eventType) 
	{
		System.out.println();
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("SNACKS : You will get wafers, a cupcake, samosas and cheese chilly toast for snacks.");
				break;
			case "Wedding":
				System.out.println("SNACKS : You will get burger, cheesy fries and cheese chilly toast for snacks.");
				break;
			case "Social":
				System.out.println("SNACKS : You will get burger, pizza and cheesy fries for snacks.");
				break;
			case "Kids":
				System.out.println("SNACKS : You will get wafers, burger, samosas and cheese chilly toast for snacks.");
				break;
			case "Birthday":
				System.out.println("SNACKS : You will get pizza, a cupcake, burger and samosa for snacks.");
				break;
		}
	}
}
