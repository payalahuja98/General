
public class BaseballPlayers1 {

	public static void main(String[] args) {
	    long[] players = new long[5];
		players[0] = 32;
		players[1] = 17;
		players[2] = 5;
		players[3] = 7;
		players[4] = 24;
		
		System.out.println(find(players,7));
		delete(players,5);
		
	}
	public static int find(long[] p,long x){
		for(int i = 0; i < p.length; i++){
			if(p[i] == x){
				return i;
			}
		}
		return -1;
	}
	public static void delete(long[] p,long y){
		int index = find(p,y);
		for(int j = index; j < p.length - 1; j++){
			p[j] = p[j + 1];
		}
		for(int a = 0; a < p.length - 1; a++){
			System.out.printf("players[%d] = %d\n",a,p[a]);
		}
	}

}
