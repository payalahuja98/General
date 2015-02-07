public class number48c {
	public static void main(String[] args) {
		int count = 0;
		int N = 128;
		while(N > 1){
			N = N/2;
			count++;
		}
		System.out.println(count);
	}

}