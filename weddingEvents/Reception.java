package weddingEvents;

import applicationPackage.*;

public class Reception 
{
	public Reception(String packageType)
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
