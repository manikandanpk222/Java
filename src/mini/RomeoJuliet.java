package mini;

	public class RomeoJuliet extends Book{
		
		private String name="RomeoJuliet";
		private String author="Shakessphere";
		
		RomeoJuliet(int quantity){
			super(quantity); //parent class constructor
			this.name = name;
			this.author = author;
		}
		
		public String getName()
		{
			return name;
		}
		
		public String getAuthor()
		{
			return author;
		}

	}


