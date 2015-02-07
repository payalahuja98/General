import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which number's factorial would you like?");
		System.out.print(fact(input.nextInt()));

	}
	public static int fact(int n){
		if(n == 0){
			return 1;
		}
		else{
			return n * fact(n - 1);
		}
	}

}
