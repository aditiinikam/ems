 package applicationPackage;

public class Decoration {
	
	public Decoration(String eventType, String packageType)
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
		System.out.println("________________________________________________________________________________________________________________________________");
		System.out.println("\nDECORATION:");
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("Normal, comfortable chairs to accomodate 200 people. 2 Flower bouquets, 1 table, 1 dais");
				break;
			case "Wedding":
				System.out.println("Normal, comfortable chairs to accomodate 350 people, flower decorations(real + false), 2 fancy lights, 1 personalized name cutout(250cm * 100cm)");
				break;
			case "Social":
				System.out.println("Decoration with 100 baloons, Normal, comfortable chairs to accomodate 200 people, 2 fancy lights, 1 personalized cutout (250cm * 100cm)");
				break;
			case "Kids":
				System.out.println("Decoration with 100 balloons depending upon your color theme. 2 Fancy lights, 1 cartoon cutout, 1 personalized name cutout(250cm * 100cm)");
				break;
			case "Birthday":
				System.out.println("Decoration with 100 balloons depending upon your color theme. 2 Fancy lights, 1 cartoon cutout, 1 personalized name cutout(250cm * 100cm)");
				break;
		}
	}
	
	public static void Gold(String eventType) 
	{
		System.out.println("________________________________________________________________________________________________________________________________");
		System.out.println("\nDECORATION:");
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("Chairs, with a satin cloth, to accomodate 500 people. 4 Flower bouquets, 2 tables, 1 dais");
				break;
			case "Wedding":
				System.out.println("Chairs, with a satin cloth, to accomodate 500 people, flower decorations(real flowers), 5 fancy lights, 2 personalized name cutout(250cm * 100cm)");
				break;
			case "Social":
				System.out.println("Decoration with 200 baloons, Chairs, with a satin cloth, to accomodate 200 people, 3 fancy lights, 2 personalized cutout (250cm * 100cm)");
				break;
			case "Kids":
				System.out.println("Decoration with 200 balloons depending upon your color theme. 3 Fancy lights, 3 cartoon cutout, 2 personalized name cutout(250cm * 100cm)");
				break;
			case "Birthday":
				System.out.println("Decoration with 200 balloons depending upon your color theme. 3 Fancy lights, 3 cartoon cutout, 2 personalized name cutout(250cm * 100cm)");
				break;
		}
	}
	
	public static void Platinum(String eventType) 
	{
		System.out.println("________________________________________________________________________________________________________________________________");
		System.out.println("\nDECORATION:");
		switch(eventType) 
		{
			case "Corporate":
				System.out.println("Sofa chairs, to accomodate 800 people. Some flower decorations(false flowers), 4 Flower bouquets, 2 tables, 1 dais");
				break;
			case "Wedding":
				System.out.println("Chairs, with and ribbons, to accomodate 800 people, flower decorations(real flowers and leaves), 10 fancy lights, 2 personalized name cutout(250cm * 100cm), Flower Showers, Confetti Cannons");
				break;
			case "Social":
				System.out.println("Decoration with 300 baloons, Chairs, with a satin cloth and ribbons, to accomodate 500 people, 5 fancy lights, 2 personalized cutout (250cm * 100cm), 1 Large Disco Ball");
				break;
			case "Kids":
				System.out.println("Decoration with 300 balloons, and real flowers, depending upon your color theme. 5 Fancy lights, 3 cartoon cutout, 1 Human Cartoon, 2 personalized name cutout(250cm * 100cm)");
				break;
			case "Birthday":
				System.out.println("Decoration with 300 balloons, and real flowers, depending upon your color theme. 5 Fancy lights, 3 cartoon cutout, 1 Human Cartoon, 2 personalized name cutout(250cm * 100cm)");
				break;
		}
	}
}
