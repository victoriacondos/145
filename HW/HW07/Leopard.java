/*
 * Victoria Condos
 */
public class Leopard extends Cat{
	private int numberOfSpots=0;
	Leopard()//default
	{
		super();	
	}
	Leopard(int aNumberOfSpots, String aMood, String aName, double aWeight)//parameterized
	{
		super(aMood, aName, aWeight);
		this.setNumberOfSpots(aNumberOfSpots);
	}
	//accessors
	public int getNumberOfSpots()
	{
		return this.numberOfSpots;
	}
	//mutators
	public void setNumberOfSpots(int aNumberOfSpots)
	{
		if(aNumberOfSpots>=0)//can't have negative spots
		{
			this.numberOfSpots=aNumberOfSpots;
		}
		else
		{
			System.out.println("Invalid Number of Spots");
		}
	}
	//methods
	public String toString()
	{
		return super.toString()+
				"\n Number of Spots: "+ this.numberOfSpots;
	}
	public boolean equals(Leopard aLeopard)
	{
		return aLeopard!=null&& super.equals(aLeopard)&& this.numberOfSpots==aLeopard.getNumberOfSpots();
	}
}
