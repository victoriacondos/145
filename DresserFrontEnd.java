/*
 * Victoria Condos
 */
import java.util.Scanner;
public class DresserFrontEnd {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		boolean quit=false;
		System.out.println("Welcome to the dresser!");
		while(quit!=true)
		{
		System.out.println(" Enter 1: to add an item"
				+"\n Enter 2: to remove an item"
				+"\n Enter 3: to print out the dresser contents"
				+"\n Enter 9: to quit");
		int userInput=keyboard.nextInt();
		if(userInput==1)
		{
			keyboard.nextLine();//fix error
			System.out.println("Enter the type. It may be Undergarment, Socks, Stockings, Top, Bottom, or Cape. ");
			String userType=keyboard.nextLine();
			System.out.println("Enter the color. it may be \"Brown\", \"Pink\", \"Orange\", \"Green\", \"Blue\", \"Purple\", or \"Grey\"" );
			String userColor=keyboard.nextLine();
			Clothing garment=new Clothing(userType, userColor);
			System.out.println(garment);
			Dresser.add(garment);
		}
		else if(userInput==2)
		{
			keyboard.nextLine();//fix error
			System.out.println("Enter the type. It may be Undergarment, Socks, Stockings, Top, Bottom, or Cape");
			String userType=keyboard.nextLine();
			System.out.println("Enter the color. it may be \"Brown\", \"Pink\", \"Orange\", \"Green\", \"Blue\", \"Purple\", or \"Grey\"" );
			String userColor=keyboard.nextLine();
			Clothing garment=new Clothing(userType, userColor);
			Dresser.remove(garment);
		}
		else if(userInput==3)
		{
			Dresser.print();
		}
		else if(userInput==9)
		{
			System.out.println("Goodbye");
			quit=true;
			System.exit(0);
		}
		}
	}
	
	

}
