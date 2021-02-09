package applicationPackage;

public class Games {
	public Games(String str){
		if(str.equalsIgnoreCase("Silver"))
		{
			System.out.println("\nGAMES: You are offered 3 games in this package.");
			System.out.println("________________________________________________________________________________________________________________________________");
		}
		else if(str.equalsIgnoreCase("Gold"))
		{
		    System.out.println("\nGAMES: You are offered 5 games in this package.");
		    System.out.println("________________________________________________________________________________________________________________________________");
		}
		else if(str.equalsIgnoreCase("Platinum"))
		{
		    System.out.println("\nGAMES: You are offered 7 games in this package.");
		    System.out.println("________________________________________________________________________________________________________________________________");
		}
	}
}

