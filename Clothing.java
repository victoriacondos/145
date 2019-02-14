/*
 * Victoria Condos
 */
	public class Clothing {
		private String type="Undergarment";
		private String color="Blue";
		public Clothing()//default constructor
		{
			
		}
		public Clothing(String aType, String aColor)
		{
			this.setType(aType);
			this.setColor(aColor);
		}
		//accessors
		public String getType()
		{
			return this.type;
		}
		public String getColor()
		{
			return this.color;
		}
		//mutators
		public void setType(String aType)//checks for valid inputed type
		{//TODO- get this to stop printing invalid type for everything
		
			if (aType.equals("Undergarment")||aType.equals("Socks")||aType.equals("Stockings")||aType.equals("Top")||aType.equals("Bottom")||aType.equals("Cape"))
			{
				this.type=aType;
			}
			else
			{
				//System.out.println("THIS" + aType);
				System.out.println("Invalid Type");
			}
			
		}
		public void setColor(String aColor)
		{
			if(aColor.equals("Brown")||aColor.equals("Pink")||aColor.equals("Orange")||aColor.equals("Green")||aColor.equals("Blue")||aColor.equals("Purple")||aColor.equals("Grey"))
			{
				this.color=aColor;
			}
			else 
			{
				System.out.println("Invalid Color");
			}
		}
		//methods
		public String toString()
		{
			return "Type: "+this.type+" Color: "+this.color;
		}
		public boolean equals(Clothing aClothing)
		{
			return aClothing!=null && this.type.equals(aClothing.getType())
					&& this.color.equals(aClothing.getColor());
		}
}
