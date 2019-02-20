/*
 * Victoria Condos
 */
import java.util.Scanner;
public class AnimalCollection {
	public static Scanner keyboard=new Scanner(System.in);
	private static final int MAX_ANIMALS=100;
	private static Animal [] animals =new Animal[MAX_ANIMALS];
	public AnimalCollection()//default
	{

	}
	public static void addAnimal(Animal anAnimal)
	{
		
		for(int i=0;i<animals.length;i++)//adds animal to array
		{
			if(animals[i]==null)
			{
				animals[i]= anAnimal;
				return;
			}
		}
		//if it reaches here array is full
		System.out.println("The collection of animals is full!");
		
	}
	public static void removeAnimal(String aName)
	{
		for(int i=0;i<animals.length;i++)
		{
			if(animals[i] != null && animals[i].getName().equals(aName))
			{
				animals[i]=null;
				return;
			}
		}
		//if reaches here, doesn't exist
		System.out.println("The animal was not found");
	}
	public static void printAnimals()
	{
		for(int i=0;i<animals.length;i++)
		{
			if(animals[i]==null)
				continue;
			System.out.println(animals[i]);
			System.out.println();
		}
	}
	public Animal[] getAnimals()
	{
		return this.animals;
	}

}

