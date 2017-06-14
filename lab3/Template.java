

public class Template {



	public static void main(String args[]) {


		//sample codes
		System.out.println("Shape1");
		System.out.println();
		System.out.println();

		shape1(9);
		System.out.println();
		//sample codes
		System.out.println("Shape2");
		System.out.println();
		System.out.println();

		shape2(9);
		System.out.println();


		//open a file in write mode "c:\\lab3.txt"

		//append following  patterns in a file e.g. "c:\\lab3.txt" one by one
		//sample codes
		System.out.println();
		System.out.println();
		System.out.println("Shape3");
		System.out.println();
		System.out.println();

		shape3(9);
		//sample codes
		System.out.println();
		System.out.println();
		System.out.println("Shape4");
		System.out.println();
		System.out.println();

		shape4(9);
		System.out.println();
		System.out.println();
		System.out.println("Shape5");
		System.out.println();
		System.out.println();

		shape5(18);

		System.out.println();
		System.out.println();
		System.out.println("Shape6");
		System.out.println();
		System.out.println();
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

		if(j>9){
			//blah
		}else{
			int length = j*2+1;
			for(int i = 0;i<j;i++){
				if(i==0||i==j-1){
					String s="";
					int num = i+1;
					for(int a=0;a<length;a++){
						s+=num;
					}
					System.out.println(s);
				}else{
					String s2="";
					int num2 = i+1;
					for(int b=0;b<length;b++){
						if(b==0||b==j||b==2*j){
						s2+=num2;
					}else{
						s2+=".";
					}
				}
				System.out.println(s2);
			}
		}



			}

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

if(j>9){
	//blah
}else{
	int length = j*2+1;
	for(int i = 0;i<j;i++){
		if(i==0||i==j-1||i==j/2){
			String s="";
			int num = i+1;
			for(int a=0;a<length;a++){
				s+=num;
			}
			System.out.println(s);
		}else{
			String s2="";
			int num2 = i+1;
			for(int b=0;b<length;b++){
				if(b==0||b==j||b==2*j){
				s2+=num2;
			}else{
				s2+=".";
			}
		}
		System.out.println(s2);
	}
}



	}
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

		if(!(j%9==0)){
			//blah
		}else{
			int length = j*2+1;
			for(int i = 0;i<j;i++){
				if(i==0||i==j-1||i==j/2){
					String s="";
					int num = 1;
					for(int a=0;a<length;a++){
						s+=num;
					}
					System.out.println(s);
				}else{
					String s2="";
					int num2 = 1;
					for(int b=0;b<length;b++){
						if(b==0||b==j||b==2*j){
						s2+=num2;
					}else if(b%3==0){
						s2+="x";
					}
					else{
						s2+=".";
					}
				}
				System.out.println(s2);
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
