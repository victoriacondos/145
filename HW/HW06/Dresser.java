/*
 * Victoria Condos
 * 
 */
public class Dresser extends Clothing {
	private static Clothing [][] clothes= new Clothing [2][5];//five drawers that each hold 2 items
	Dresser()//default constructor
	{
		super();
	}
	//methods
	public static Clothing add(Clothing aClothing)//adds garment to correct drawer
	{//TODO-I think problem is in here, keeps saying invalid type
		if(aClothing.getType().equals("Undergarment"))//undergarments go in top drawer 
		{
			int drawerNum=0;
			for(int i=0;i<2;i++)
			{
				if(clothes[i][drawerNum]==null)//checks if drawer is empty
				{
					clothes[i][drawerNum]=aClothing;
					break;
				}
				else if(clothes[0][drawerNum]!=null && clothes[1][drawerNum]!=null)//if drawer is full, tell user
				{
					System.out.println(aClothing.getType()+" Drawer is full");
					break;
				}
			}
		}
		else if(aClothing.getType().equals("Socks")||aClothing.getType().equals("Stockings"))//socks and stockings go in next drawer
		{
			int drawerNum=1;
			for(int i=0;i<2;i++)
			{
				if(clothes[i][drawerNum]==null)//checks if drawer is empty
				{
					clothes[i][drawerNum]=aClothing;
					break;
				}
				else if(clothes[0][drawerNum]!=null && clothes[1][drawerNum]!=null)//if draw is full, tell user
				{
					System.out.println(aClothing.getType()+" Drawer is full");
					break;
				}
			}
		}
		else if(aClothing.getType().equals("Top"))//tops go in the following drawer
		{
			int drawerNum=2;
			for(int i=0;i<2;i++)
			{
				if(clothes[i][drawerNum]==null)//checks if drawer is empty
				{
					clothes[i][drawerNum]=aClothing;
					break;
				}
				else if(clothes[0][drawerNum]!=null && clothes[1][drawerNum]!=null)
				{
					System.out.println(aClothing.getType()+" Drawer is full");
					break;
				}
			}
		}
		else if(aClothing.getType().equals("Bottom"))//bottoms go in the subsequent drawer
		{
			int drawerNum=3;
			for(int i=0;i<2;i++)
			{
				if(clothes[i][drawerNum]==null)//checks if drawer is empty
				{
					clothes[i][drawerNum]=aClothing;
					break;
				}
				else if(clothes[0][drawerNum]!=null && clothes[0][drawerNum]!=null)//if drawer is full, tell user
				{
					System.out.println(aClothing.getType()+" Drawer is full");
					break;
				}
			}
		}
		else//cape is only valid type left, goes in bottom cape drawer
		{
			int drawerNum=4;
			for(int i=0;i<2;i++)
			{
				if(clothes[i][drawerNum]==null)//checks if drawer is empty
				{
					clothes[i][drawerNum]=aClothing;
					break;
				}
				else if(clothes[0][drawerNum]!=null && clothes[1][drawerNum]!=null)//if drawer is full, tell user
				{
					System.out.println(aClothing.getType()+" Drawer is full");
					break;
				}
			}
		}
		return null;
	}
	public static Clothing remove(Clothing aClothing)//searches for garment and removes it
	{
		
		if(aClothing.getType().equals("Undergarment"))//undergarments are in top drawer 
		{
			int drawerNum=0;
			for(int i=0;i<2;i++)
			{
				if(clothes[i][drawerNum].equals(aClothing))//checks if it is in each spot
				{
					clothes[i][drawerNum]=null;
					break;
				}
			}
		}
		else if(aClothing.getType().equals("Socks")||aClothing.getType().equals("Stockings"))//socks and stockings go in next drawer
		{
			int drawerNum=1;
			for(int i=0;i<2;i++)
			{
				if(clothes[i][drawerNum].equals(aClothing))//checks if it is in each spot
				{
					clothes[i][drawerNum]=null;
					break;
				}
			}
		}
		else if(aClothing.getType().equals("Top"))//tops are in the following drawer
		{
			int drawerNum=2;
			for(int i=0;i<2;i++)
			{
				if(clothes[i][drawerNum].equals(aClothing))//checks if it is in each spot
				{
					clothes[i][drawerNum]=null;
					break;
				}
			}
		}
		else if(aClothing.getType().equals("Bottom"))//bottoms are in the subsequent drawer
		{
			int drawerNum=3;
			for(int i=0;i<2;i++)
			{
				if(clothes[i][drawerNum].equals(aClothing))//checks if it is in each spot
				{
					clothes[i][drawerNum]=null;
					break;
				}
			}
		}
		else//cape is only valid type left, is in bottom cape drawer
		{
			int drawerNum=4;
			for(int i=0;i<2;i++)
			{
				if(clothes[i][drawerNum].equals(aClothing))//checks if it is in each spot
				{
					clothes[i][drawerNum]=null;
					break;
				}
			}
		}

		
		return null;
	}
	public static String print()//prints drawers
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Drawer "+i);
			for(int j=0;j<2;j++)
			{
				System.out.println(" "+clothes[j][i]);
			}
		}
		return null;
		
	}
}
