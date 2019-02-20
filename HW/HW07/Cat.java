
public class Cat extends Animal{
private String mood="none";
	Cat()//default 
	{
		super();
	}
	Cat(String aMood, String aName, double aWeight)//parameterized
	{
		super(aName, aWeight);
		this.setMood(aMood);
	}
	//accessors
	public String getMood()
	{
		return this.mood;
	}
	//mutators
	public void setMood(String aMood)//can only be these 3 moods
	{
		aMood=aMood.toLowerCase();//case is negligible
		if(aMood.equals("sleepy")||aMood.equals("playful")||aMood.equals("hungry"))
		{
			this.mood=aMood;
		}
		else
		{
			System.out.println("Invalid Mood");
		}
	}
	//methods
	public String toString()
	{
		return super.toString() +"\n Mood: "+ this.mood;
	}
	public boolean equals(Cat aCat)
	{
		return aCat!=null&& super.equals(aCat) && this.mood.equals(aCat.getMood());
	}
	
}
