package weddingEvents;

import applicationPackage.Decoration;
import applicationPackage.Games;
import applicationPackage.Host;
import applicationPackage.Meal;
import applicationPackage.Photography;
import applicationPackage.Snacks;
import applicationPackage.SoftDrinks;
import applicationPackage.Videography;

public class Wedding 
{
	public Wedding(String packageType)
	{
		new Decoration("Wedding", packageType);
		new Meal(packageType);
		new Snacks("Wedding", packageType);
		new SoftDrinks("Wedding", packageType);
		new Games(packageType);
		new Host();
		new Photography("Wedding",packageType);
		new Videography(packageType);
	}
}
