/*
 * Victoria Condos
 */
public class DomesticDog extends Dog {
	private String type="none";
	public DomesticDog()//default
	{
		super();
	}
	public DomesticDog(String aType, String aName, double aWeight, int anEnergyLevel)//parameterized
	{
		super(anEnergyLevel, aName, aWeight);
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
		aType=aType.toLowerCase();
		if(aType.equals("retriever")||aType.equals("terrier")||aType.equals("husky")||aType.equals("yappy")||aType.equals("mutt"))
		{
			this.type=aType;
		}
	}
	//methods
	public String toString()
	{
		return super.toString() + "\n Type: "+ this.type;
	}
	public boolean equals(DomesticDog aDDog)
	{
		return aDDog!=null && super.equals(aDDog)&& this.type.equals(aDDog.getType());
	}
}
