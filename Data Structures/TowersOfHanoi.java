import java.util.Scanner;
public class TowersOfHanoi {
	private static int col1 = 0;
	private static int col2 = 0;
	private static int col3 = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of discs");
		int discs = input.nextInt();
		move(discs);

	}
	public static void move(int d){
	  if(d == 1){
		  return;
	  }
	  else{
		col1 = d;
		System.out.printf("col1: %d,col2: %d,col3: %d\n",col1,col2,col3);
		if(d % 2 == 0){
			col1--;
			col2++;
			move(col1);
			System.out.printf("col1: %d,col2: %d,col3: %d\n",col1,col2,col3);
		}
		else{
			col1--;
			col3++;
			move(col1);
			System.out.printf("col1: %d,col2: %d,col3: %d\n",col1,col2,col3);
		}
	  
	  }
	  System.out.printf("col1: %d,col2: %d,col3: %d\n",col1,col2,col3);
	}

}
