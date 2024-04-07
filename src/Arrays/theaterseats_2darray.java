package Arrays;

public class theaterseats_2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] []theaterSeats= {
				{0,0,1,1,0},
				{0,1,1,1,0},
				{0,0,1,0,0},
				{1,1,1,0,1},
				{0,1,0,0,0}
		};
		int groupSize =2;
		int rows=theaterSeats.length;
		int cols=theaterSeats[0].length;
		
		outerLoop:for(int i=0;i<rows;i++) {
			for (int j=0;j<cols-groupSize+1;j++) {
				innerLoop:for(int k=0;k<groupSize;k++) {
					if(theaterSeats [i] [j+k]==1) {
						continue outerLoop;
					}
				}
				System.out.println("Row:"+i+",Seats:"+j+"and"+(j+1));
				
				break outerLoop;
			}
		}

	}

}
