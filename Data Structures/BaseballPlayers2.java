
public class BaseballPlayers2 {

	public static void main(String[] args) {
	    long[] players = new long[5];
	    
		setElement(players,0,1);
		setElement(players,1,5);
		setElement(players,2,12);
		setElement(players,3,23);
		setElement(players,4,34);
		
		System.out.println(find(players,12));
		//System.out.println(find(players,23));
	    delete(players,23);
		
	}
	public static void setElement(long[] p,int index,long z){
		p[index] = z;
	}
	public static int find(long[] p,long x){
		int lowerB = 0;
		int higherB = p.length - 1;   //higherB = 5 - 1 = 4
		int currentIndex = (lowerB + higherB)/2; //currentIndex = 2
		
		for(int b = 0; b < p.length; b++){  //b = 0; b < 5
		  if(p[currentIndex] == x){     //p[1] == 5
			  return currentIndex;
		  }
		  else{
			if(p[currentIndex] > x){    //p[2] > 5   12 > 5
				currentIndex--;    //currentIndex = 1
			}
			else{
				if(p[currentIndex] < x){
					currentIndex++;
				}
			}
		  }
		  
		}
		return -1;
		/*for(int i = 0; i < p.length; i++){
			if(p[i] == x){
				return i;
			}
		}
		return -1;*/
	}
	public static void delete(long[] p,long y){
		//System.out.println(find(p,y));
		
		int index = find(p,y);
		for(int j = index; j < p.length - 1; j++){
			p[j] = p[j + 1];
		}
		for(int a = 0; a < p.length - 1; a++){
			System.out.printf("players[%d] = %d\n",a,p[a]);
		}
	}

}

