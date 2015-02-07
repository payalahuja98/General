public class number48e {
	public static void main(String[] args) {
		int count = 0;
		int N = 4;
		for(int i = 1; i <= N; i++){
			count++;
		}
		for(int i = N; i >= 0; i--){
			count++;
		}
		System.out.println(count);
	}

}