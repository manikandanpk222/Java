package mini;

	import java.util.Scanner;

	public class BookbankDriver {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			BookBank b1 = new BookBank();
			boolean exit = true; // ----looping
			
			while(exit)
			{
				System.out.println("Enter a choice:   1(AddBook)\n 2(RemoveBook) \n 3(CheckCart) \n 4(show book)");
				int choice = sc.nextInt();
				
				switch(choice)
				{
					case 1:
					{
						System.out.println(" \\n1Harry Potter \\n2RomeoJuliet ");
						choice = sc.nextInt();
						
						switch (choice)
						{
							case 1: 
							{
								System.out.println(" Enter the quantity of Harrypotter");
								int quantity = sc.nextInt();
								b1.addBook(choice, quantity);
								System.out.println("Harry potter book added successfully.");
								
							} //case 1 close
							break;
							case 2: 
							{
								System.out.println(" Enter the quantity of RomeoJuliet");
								int quantity = sc.nextInt();
								b1.addBook(choice, quantity);
								System.out.println("RomeoJuliet book added successfully.");
								
							}
							break; //case 2 close
							default:
								System.out.println("Invalid choice");
						} //switch close
						break;
					} //outside case1 - close
					
				case 2:b1.removeBook();//bookbank calling method
				break;
				case 3: b1.checkCart();
				break;
				case 4: b1.showBook();
				break;
				default:
				System.out.println("Invalid Choice");
				} //outside switch case
				
			} //closing while loop
			
			

		} //main method

	}//class closed


