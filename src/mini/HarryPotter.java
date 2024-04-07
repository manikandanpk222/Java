package mini;

	public class HarryPotter extends Book {
		
		private String name="Harrypotter";
		private String author="J.K.Rowling";
		
		HarryPotter(int quantity){
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



