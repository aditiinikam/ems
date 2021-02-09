package birthdayEvents;

import applicationPackage.Decoration;
import applicationPackage.Games;
import applicationPackage.Host;
import applicationPackage.Meal;
import applicationPackage.Photography;
import applicationPackage.Snacks;
import applicationPackage.SoftDrinks;

public class ThemedParties 
{
	public ThemedParties(String packageType)
	{
		new Decoration("Birthday", packageType);
		new Meal(packageType);
		new Snacks("Birthday", packageType);
		new SoftDrinks("Birthday", packageType);
		new Games(packageType);
		new Host();
		new Photography("Birthday",packageType);
	}
}
