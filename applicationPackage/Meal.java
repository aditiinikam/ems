package applicationPackage;

public class Meal {
	
	public Meal(String str){
		if(str.equalsIgnoreCase("Silver")) 
		{
			System.out.println("________________________________________________________________________________________________________________________________");
			System.out.println("\nMEAL:");
			System.out.println("Your package includes the following dinner/ lunch menu : ");
			System.out.println("Puri, Roti, Gulab Jamun, Jalebi, Dal, Jeera Rice, Fryums, 3 types of Chutnies, Pickle, Butter Paneer, Mix Vegies, Palak bhaji.");
		}
		else if(str.equalsIgnoreCase("Gold")) 
		{
			System.out.println("________________________________________________________________________________________________________________________________");
			System.out.println("\nMEAL:");
			System.out.println("Your package includes the following dinner/ lunch menu : ");
			System.out.println("Indian : Rumali Roti, Puri, Rasmalai, Moong Daal Halwa, 3 types of Chutnies, Papad, Butter Paneer, Chole Masala, Mix Vegies, Jeera Rice, Dal, Onion Pakoda.");
			System.out.println("Chinese : Spring Rolls, Veg Hakka Noodles, Manchurian Soup \nDessert : Vanilla Icecream");
		}
		else if(str.equalsIgnoreCase("Platinum")) 
		{
			System.out.println("________________________________________________________________________________________________________________________________");
			System.out.println("\nMEAL:");
			System.out.println("Your package includes the following dinner/ lunch menu : ");
			System.out.println("Rumali Roti, Puri, Rasmalai, Moong Daal Halwa, Shitafal Rabadi, 3 types of Chutnies, Papad, Butter Paneer, Chole Masala, Mix Vegies, Jeera Rice, Dal, Onion Pakoda.");
			System.out.println("Chinese : Veg Manchurian, Spring Rolls, Veg Hakka Noodles, Manchurian Soup \nDessert : Icecream(Vanilla, Chocolate, Butterscotch) ");
			System.out.println("Chat : Bhel, Panipuri");
		}
	}

}
