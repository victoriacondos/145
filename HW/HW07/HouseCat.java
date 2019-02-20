/*
 * Victoria Condos
 */
public class HouseCat extends Cat {
	private String type="none";
	HouseCat()//default
	{
		super();
	}
	HouseCat(String aType, String aMood, String aName, double aWeight)//parameterized
	{
		super(aMood, aName, aWeight);
		this.setType(aType);
	}
	//accessors
	public String getType()
	{
		return this.type;
	}
	//mutators
	public void setType(String aType)
	{
		aType=aType.toLowerCase();//case is negligible
		if(aType.equals("short hair")||aType.equals("bombay")||aType.equals("ragdoll")||aType.equals("sphinx")||aType.equals("scottish fold"))
		{
			this.type=aType;
		}
		else
		{
			System.out.println("Invalid Type");
		}
	}
	//methods
	public String toString()
	{
		return super.toString() +
				"\n Type: "+ this.getType();
	}
	public boolean equals(HouseCat aHouseCat)
	{
		return aHouseCat!=null && super.equals(aHouseCat)&& this.type.equals(aHouseCat.getType());
	}
}
