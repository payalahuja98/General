import java.util.Scanner;
import java.util.Stack;

public class ReverseString{
	public static void main(String[] args){
		Stack<String> sentence = new Stack<String>();
		Scanner input = new Scanner(System.in);
		for(int j = 0; j < 3; j++){
			sentence.push(input.next());
		}
		reverse(sentence);
	}
	public static void reverse(Stack<String> s){
		for(int i = 0; i < s.size(); i++){
		 while(!s.isEmpty()){
			System.out.println(s.pop());
		 }
		}
	}

}

