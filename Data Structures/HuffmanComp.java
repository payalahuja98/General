import java.util.ArrayList;

public class HuffmanComp{
	String sentence;
	//int[] freq = new int[26];
	ArrayList<Letter> freq = new ArrayList<Letter>();
	int index;
	int numElements;
	
	public HuffmanComp(String s){
		sentence = s.toUpperCase();				//sentence = ABC
		for(int i = 0; i < 26; i++){	//i = 0; i < 26; i++
			freq.add(i,new Letter());  						//freq.set(0,a)
		}
		traverse();
	}
	public void traverse(){
		int count = 0;
		while(count < sentence.length()){		//0 < 3
			if(sentence.charAt(count) >= 65 && sentence.charAt(count) <= 90){
				add(sentence.charAt(count));	//add(A)
			}
			count++;
		}
	}
	public void add(char c){
		index = ((int) c) - 65;	//index = 0
		freq.get(index).inc();	//freq.get(0) = 1
		freq.get(index).setLetter(c);
		numElements++;
	}
	public void print(){
		for(int i = 0; i < numElements; i++){
			System.out.println(freq.get(i).toString());
		}
	}
	public ArrayList<Letter> getArrayList(){
		return freq;
	}
	public ArrayList <BSTNode> sortList(ArrayList <Letter> unsorted)
	{
		ArrayList <BSTNode> sorted = new ArrayList <BSTNode>();
		
		for(BSTNode test : unsorted)
		{
			if(sorted.isEmpty())
			{
				sorted.add(test);
			}
			else
			{
				sorted = addToList(sorted, test);
			}
		}
		
		return sorted;
	}
	
	public ArrayList <BSTNode> addToList(ArrayList <BSTNode> oldList, BSTNode toAdd)
	{
		ArrayList <BSTNode> newList = oldList;
		
		forLoop:
		for(BSTNode test : newList)
		{
			if(((int)toAdd.getInfo()) > ((int)test.getInfo()))
			{
				newList.add(newList.indexOf(test), toAdd);
				break forLoop;
			}
			
		}
		
		return newList;
	}
	
	public void toTree(ArrayList <BSTNode> sorted)
	{
		BSTNode left;
		BSTNode right;
		Number root;
		
		while(!sorted.isEmpty())
		{
			right = sorted.get(sorted.size());
			sorted.remove(sorted.size());
			left = sorted.get(sorted.size());
			sorted.remove(sorted.size());
			
			root = new Number(((int)left.getInfo()) + ((int)right.getInfo()));
			root.setLeft(left);
			root.setRight(right);
			sorted = addToList(sorted, root);
		}
	}
}
