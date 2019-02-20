/*
 * Victoria Condos
 */
import java.util.Scanner;
public class AnimalFrontEnd {
	public static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args)
	{
		AnimalCollection aCollection=new AnimalCollection();
		boolean quit=false;
		System.out.println("Welcome to the Cat and Dog Collection!");
		while(quit==false)
		{
			System.out.println("Would you like to "
				+"\n 1. Add a cat or dog"
				+"\n 2. Remove a cat or dog"
				+"\n 3. Quit");
			int userAnswer=keyboard.nextInt();
			if(userAnswer==1)
			{
				
				System.out.println("Would you like to add a 1. House Cat, 2. Leopard, 3. Domestic Dog, or 4. Wolf?");
				int animalType=keyboard.nextInt();
				if(animalType==1)
				{
					System.out.println("Enter the house cat's name, weight, mood and type");
					keyboard.nextLine();
					String aName=keyboard.nextLine();
					double aWeight=keyboard.nextDouble();
					keyboard.nextLine();
					String aMood=keyboard.nextLine();
					String aType=keyboard.nextLine();
					HouseCat HCat=new HouseCat(aType, aMood, aName, aWeight);
					AnimalCollection.addAnimal(HCat);
				}
				else if(animalType==2)
				{
					System.out.println("Enter the leopards name, weight, mood, and number of spots");
					keyboard.nextLine();
					String aName=keyboard.nextLine();
					double aWeight=keyboard.nextDouble();
					keyboard.nextLine();
					String aMood=keyboard.nextLine();
					int aNumSpots=keyboard.nextInt();
					Leopard aLeopard=new Leopard(aNumSpots, aMood, aName, aWeight);
					AnimalCollection.addAnimal(aLeopard);
				}
				else if(animalType==3)
				{
					System.out.println("Enter the domestic dog's name, weight, energy level, and type.");
					keyboard.nextLine();
					String aName=keyboard.nextLine();
					double aWeight=keyboard.nextDouble();
					int anELevel=keyboard.nextInt();
					keyboard.nextLine();
					String aType=keyboard.nextLine();
					DomesticDog DDog=new DomesticDog(aType, aName, aWeight, anELevel);
					AnimalCollection.addAnimal(DDog);
				}
				else if(animalType==4)
				{
					System.out.println("Enter the wolf's name, weight, energy level, and pack leaders name.");
					keyboard.nextLine();
					String aName=keyboard.nextLine();
					double aWeight=keyboard.nextDouble();
					int eLevel=keyboard.nextInt();
					keyboard.nextLine(); 
					String packLeader=keyboard.nextLine();
					Wolf aWolf=new Wolf(packLeader, eLevel, aName, aWeight);
					AnimalCollection.addAnimal(aWolf);
				}
			}
			else if(userAnswer==2)
			{
				System.out.println("Enter the animal's name that is to be removed.");
				keyboard.nextLine();
				String animalName=keyboard.nextLine();
				AnimalCollection.removeAnimal(animalName);
			} 
			else if(userAnswer==3)
			{
				System.out.println("Goodbye!");
				quit=true;
			}
		AnimalCollection.printAnimals();
		}
	}
	


}
