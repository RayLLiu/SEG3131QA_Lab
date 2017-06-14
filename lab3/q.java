

public class Template {
	

	
	public static void main(String args[]) {
		
	
		//sample codes
		shape1(9);		
		System.out.println();
		shape2(9);
		System.out.println();
		
		
		//open a file in write mode "c:\\lab3.txt"
		
		//append following  patterns in a file e.g. "c:\\lab3.txt" one by one
		
		shape3(9);
		shape4(9);
		shape5(9);
		shape6(9);
		
		//read the pattern File e.g. "c://lab3.txt" and display to the screen
		

	}

	//sample pattern printing to the screen
	public static void shape1(int j) {
		for (int i = 1; i <= j; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}


	//sample pattern printing to the screen
	public static void shape2(int j) {
		for (int i = 1; i <= j; i++) {
			for (int k = 1; k <= (j * 2 + 1); k++) {
				System.out.print(i);
			}
			System.out.println();
		}		

	}
	
	/*
	 * 
1111111111111111111
2........2........2
3........3........3
4........4........4
5........5........5
6........6........6
7........7........7
8........8........8
9999999999999999999
	
	* 
	*/


	//save the pattern in a file
	//need to handle the exceptions
	public static void shape3(int j) {
				
				/*
				 * 
				 * Complete this code to make above pattern
				 * 
				 */
				
		
	}
	
	/*
	 * 
1111111111111111111
2........2........2
3........3........3
4........4........4
5555555555555555555
6........6........6
7........7........7
8........8........8
9999999999999999999
	
	* 
	*/

	//save the pattern in a file
	//need to handle the exceptions
	public static void shape4(int j) {
				
				/*
				 * 
				 * Complete this code to make above pattern
				 * 
				 */

						

	}
	
	/*
	 * 
1111111111111111111
1..x..x..1..x..x..1
1..x..x..1..x..x..1
1..x..x..1..x..x..1
1111111111111111111
1..x..x..1..x..x..1
1..x..x..1..x..x..1
1..x..x..1..x..x..1
1111111111111111111
	
	* 
	*/

	//save the pattern in a file
	//need to handle the exceptions
	public static void shape5(int j) {
	12 45 78 1011 1314 		
				/*
				 * 
				 * Complete this code to make above pattern
				 * 
				 */

				for (int i = 1; i <= j; i++) {
					if (i == 1)||(i == j/2+1 )||(i == j){
						for (int k = 0; k<j; k++){
							System.out.print("1");
						}	
						System.out.println(" ");
					}
					else{
						for (int l = 1; l<j+1; l++){
							if (l ==1 )||(l==j/2+1) ||(l==j){
								System.out.print("1");
							}else{
								if(l = )
							}
								
						}
						
					}
					
					
				
				}
				
		

	}

	/*
	 * 
.........1.........
........222........
.......33333.......
......4444444......
.....555555555.....
....66666666666....
...7777777777777...
..888888888888888..
.99999999999999999.
	
	* 
	*/
	
	//save the pattern in a file
	//need to handle the exceptions
	public static void shape6(int j) {
				
				/*
				 * 
				 * Complete this code to make above pattern
				 * 
				 */
				for (int i = 1; i <= j; i++) {
					//print 20/2-i
					for (int y = 1; y<=j-i+1;  y ++){
						System.out.print('.');
					}
					for (int k = 0; k<2*i-1; k++){
						System.out.print(i);
					}
					for (int l = 0; l< j+1-i;  l++){
						System.out.print('.');
					}
		System.out.println(' ');
	}
}	
	
	
}
