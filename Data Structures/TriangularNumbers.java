import java.util.Scanner;
public class TriangularNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which triangular number would you like?");
		System.out.print(triangle(input.nextInt()));

	}
	public static int triangle(int n){
		if(n == 1){
			return 1;
		}
		else{
			return n + triangle(n - 1);
		}
	}

}
