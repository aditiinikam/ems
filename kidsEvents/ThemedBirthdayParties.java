package kidsEvents;

import applicationPackage.Decoration;
import applicationPackage.Games;
import applicationPackage.Host;
import applicationPackage.Meal;
import applicationPackage.Photography;
import applicationPackage.Snacks;
import applicationPackage.SoftDrinks;

public class ThemedBirthdayParties 
{
	public ThemedBirthdayParties(String packageType)
	{
		new Decoration("Kids", packageType);
		new Meal(packageType);
		new Snacks("Kids", packageType);
		new SoftDrinks("Kids", packageType);
		new Games(packageType);
		new Host();
		new Photography("Kids",packageType);
	}
}
