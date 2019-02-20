/*
 * Victoria Condos
 */
public class Dog extends Animal{
	private int energyLevel=0;
	Dog()//default
	{
		super();
	}
	Dog(int anEnergyLevel, String aName, double aWeight)//parameterized
	{
		super(aName, aWeight);
		this.setEnergyLevel(anEnergyLevel);
	}
	//accessors
	public int getEnergyLevel()
	{
		return this.energyLevel;
	}
	//mutators
	public void setEnergyLevel(int anEnergyLevel)
	{
		if(anEnergyLevel>=0 && anEnergyLevel<=100)
		{
			this.energyLevel=anEnergyLevel;
		}
		else
		{
			System.out.println("Invalid Energy Level");
		}
	}
	//methods
	public String toString()
	{
		return super.toString()+ "\n Energy Level : "+ this.getEnergyLevel();
	}
	public boolean equals(Dog aDog)
	{
		return aDog!=null && this.energyLevel==aDog.getEnergyLevel();
	}
}
