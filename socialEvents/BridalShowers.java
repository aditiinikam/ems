package socialEvents;

import applicationPackage.Decoration;
import applicationPackage.Games;
import applicationPackage.Host;
import applicationPackage.Meal;
import applicationPackage.Photography;
import applicationPackage.Snacks;
import applicationPackage.SoftDrinks;

public class BridalShowers 
{
	public BridalShowers(String packageType)
	{
		new Decoration("Social", packageType);
		new Meal(packageType);
		new Snacks("Social", packageType);
		new SoftDrinks("Social", packageType);
		new Games(packageType);
		new Host();
		new Photography("Social",packageType);
	}
}
