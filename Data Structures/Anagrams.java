import java.util.Scanner;
public class Anagrams {
	static String w1 = "";
	static int count;
	static int x = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word");  //cat
		String word = input.nextLine();
		count = (word.length()^2 + word.length())/2;
		anag(word,count);
	}
	public static void anag(String w,int c){  //w = atc
		if(x == c){     //if("" == cat) Nope!
			return;
		}
		else{
			w1 = w.substring(1) + w.charAt(0);  //w1 = atc
			System.out.println(w1);
			x++;
			anag(w1,c);  //atc
		}
	}

}
