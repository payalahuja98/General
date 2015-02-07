import java.util.Scanner;
public class HuffmanCompTest {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter a string");
    	String sentence = input.nextLine();
    	System.out.println();
    	System.out.println(sentence.toUpperCase());
    	HuffmanComp test = new HuffmanComp(sentence);
    	test.print();
    }
	
}
