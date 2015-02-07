public class Letter extends BSTNode {
	int freq;
	char letter;
	
	public Letter(){
		super(null);
	}
	public Letter(int f, char l){
		freq = f;
		letter = l;
	}
	public Letter(char l){
		letter = l;
		freq = 0;
	}
	public void inc(){
		freq++;
	}
	public void setLetter(char c){
		letter = c;
	}
	public String toString(){
		return letter + " " + freq;
	}
}
