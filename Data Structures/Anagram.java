import java.util.Scanner;
public class Anagram {
	static int count = 0;
	static int size;
	static char[] array = new char[5];
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter word");
		String word = input.nextLine();
		size = word.length();
		for(int i = 0; i < size; i++){
			array[i] = word.charAt(i);
		}
		doAnagram(size);
	}
    public static void doAnagram(int newSize){
    	if(newSize == 1){
    		return;
    	}
    	for(int x = 0; x < newSize; x++){
    		doAnagram(newSize - 1);
    		if(newSize == 2){
    			displayWord();
    		}
    		rotate(newSize);
    	}
    }
    public static void displayWord(){
    	if(count < 99){
    		System.out.print(" ");
    	}
    	if(count < 9){
    		System.out.print(" ");
    	}
    	System.out.print(++count + " ");
    	for(int j = 0; j < array.length; j++){
    		System.out.print(array[j] + " ");
    	}
    	System.out.flush();
    	if(count % 6 == 0){
    		System.out.println();
    	}
    }
    public static void rotate(int nSize){
    	int position = size - nSize;
    	char temp = array[position];
    	for(int k = position + 1; k < size; k++){
    		array[k-1] = array[k];
    		array[k] = temp;
    	}
    }
}
