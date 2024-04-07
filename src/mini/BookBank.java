package mini;


	public class BookBank {
		Book b;
		
		public void addBook(int choice, int quantity)
		{
			if (this.b==null)
			{
				if (choice ==1)
				{
					b=new HarryPotter(quantity);
				}
				else if(choice==2)
				{
					b=new RomeoJuliet(quantity);
				}
				else
				{
					System.out.println("Invalid Choice");
				}
			}
			else
			{
				System.out.println("Book is already added");
			}
			
		}
		
		public void removeBook()
		{
			if(this.b==null)
			{
				System.out.println("Book is not yet added");
			}
			else
			{
				this.b=null;
				System.out.println("Book is removed successfully.");
			}
		}
		
		
		
		public void checkCart()
		{
			if(this.b==null)
			{
				System.out.println("Book bank is empty");
			}
			else
			{
				System.out.println("Book bank is not empty");
			}
		}
		public void showBook()
		{
			if(this.b==null)
			{
				System.out.println("Book is not added yet");
			}
			else
			{
				if(b instanceof HarryPotter)
				{
					HarryPotter h1=(HarryPotter)b;
					System.out.println("you can read: " +h1.getName());
					System.out.println("The author:  " + h1.getAuthor());
					
				}
				else 
				{
					RomeoJuliet r1=(RomeoJuliet)b;
					System.out.println("you can read: " +r1.getName());
					System.out.println("The author:  " + r1.getAuthor());
					
				} //inside if -else loop
				
			}//outside if-else loop
		} // show book 

	}


