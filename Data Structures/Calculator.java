import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		double result = 0.0;
		char key = 'y';
		Scanner input = new Scanner(System.in);
	 do{
		System.out.println("Enter operation");
		String op = input.nextLine();
		result = calc(op,result);
		System.out.println(result);
		System.out.println("Enter y to do another calculation or n to quit.");
		key = input.nextLine().charAt(0);
	 }
	 while(key == 'y');
		
	}
	public static
	double calc(String o, double res){
		switch(o.charAt(0)){
		case '+':
			 res += (int) o.charAt(1) - 48;
			 break;
		
		case '-':
			 res -= (int) o.charAt(1) - 48;
			 break;
		
		case '*':
			 res *= (int) o.charAt(1) - 48;
			 break;
		
		case '/':
			 res /= (int) o.charAt(1) - 48;
			 break;
		default:
			 System.out.println(o + " is not a valid operation");
		
	}
		return res;
  }
}
