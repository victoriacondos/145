	/*
	 * Victoria Condos
	 */
public class Wolf extends Dog{
	private String packLeaderName="none";
	public Wolf()//default
	{
		super();
	}
	public Wolf(String aPackLeaderName, int anEnergyLevel, String aName, double aWeight)//parameterized
	{
		super(anEnergyLevel, aName, aWeight);
		this.setPackLeaderName(aPackLeaderName);
	}
	//accessors
	public String getPackLeaderName()
	{
		return this.packLeaderName;
	}
	//mutators
	public void setPackLeaderName(String aPackLeaderName)
	{
		this.packLeaderName=aPackLeaderName;
	}
	//methods
	public String toString()
	{
		return super.toString()+ "\n Pack Leader Name: "+this.packLeaderName;
	}
	public boolean equals(Wolf aWolf)
	{
		return aWolf!=null && super.equals(aWolf)&& this.packLeaderName.equals(aWolf.getPackLeaderName());
	}
}
