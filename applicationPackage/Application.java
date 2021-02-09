package applicationPackage;

import java.util.Scanner;
import corporateEvents.*;
import socialEvents.*;
import weddingEvents.*;
import kidsEvents.*;
import birthdayEvents.*;

public class Application 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the event type: ");
		String eventType = sc.next();
		System.out.println("Enter the event name: ");
		String event = sc.next();
		System.out.println("Enter the package that you want to choose (Silver/Gold/Platinum) : ");
		String packg=sc.next();
		
		if(eventType.equalsIgnoreCase("Corporate")) 
		{	
			if(event.equalsIgnoreCase("Conference"))
			{
				new Conferences(packg);
			}
			else if(event.equalsIgnoreCase("Inauguration"))
			{
				new Inaugurations(packg);
			}
			else if(event.equalsIgnoreCase("Seminar"))
			{
				new Seminars(packg);
			}
			else if(event.equalsIgnoreCase("Workshop"))
			{
				new Workshops(packg);
			}
		}
		else if(eventType.equalsIgnoreCase("Social")) 
		{	
			if(event.equalsIgnoreCase("Anniversary"))
			{
				new Anniversaries(packg);
			}
			else if(event.equalsIgnoreCase("BachelorsBachelorettes"))
			{
				new BachelorsBachelorettes(packg);
			}
			else if(event.equalsIgnoreCase("BridalShower"))
			{
				new BridalShowers(packg);
			}
			else if(event.equalsIgnoreCase("CocktailParty"))
			{
				new CocktailParties(packg);
			}
			else if(event.equalsIgnoreCase("Farewell"))
			{
				new Farewells(packg);
			}
			else if(event.equalsIgnoreCase("Freshers"))
			{
				new Freshers(packg);
			}
			else if(event.equalsIgnoreCase("HouseWarming"))
			{
				new HouseWarming(packg);
			}
			else if(event.equalsIgnoreCase("Reunion"))
			{
				new Reunions(packg);
			}
		}
		else if(eventType.equalsIgnoreCase("Wedding")) 
		{	
			if(event.equalsIgnoreCase("Engagement"))
			{
				new Engagement(packg);
			}
			else if(event.equalsIgnoreCase("Haldi") || event.equalsIgnoreCase("Mehendi") || event.equalsIgnoreCase("Sangeet"))
			{
				new HaldiMehendiSangeet(packg);
			}
			else if(event.equalsIgnoreCase("Wedding"))
			{
				new Wedding(packg);
			}
			else if(event.equalsIgnoreCase("Reception"))
			{
				new Reception(packg);
			}
		}
		else if(eventType.equalsIgnoreCase("Kids")) 
		{	
			if(event.equalsIgnoreCase("BabyShower"))
			{
				new BabyShowers(packg);
			}
			else if(event.equalsIgnoreCase("NamingCeremony"))
			{
				new NamingCeremonies(packg);
			}
			else if(event.equalsIgnoreCase("ThemedBirthdayParty"))
			{
				new ThemedBirthdayParties(packg);
			}
			else if(event.equalsIgnoreCase("WelcomeBabyParty"))
			{
				new WelcomeBabyParties(packg);
			}
		}
		else if(eventType.equalsIgnoreCase("Birthday")) 
		{	
			if(event.equalsIgnoreCase("DinnerParty"))
			{
				new DinnerParties(packg);
			}
			else if(event.equalsIgnoreCase("GardenParty"))
			{
				new GardenParties(packg);
			}
			else if(event.equalsIgnoreCase("SurpriseParty"))
			{
				new SurpriseParties(packg);
			}
			else if(event.equalsIgnoreCase("ThemedParty"))
			{
				new ThemedParties(packg);
			}
		}

		sc.close();
	}
}
