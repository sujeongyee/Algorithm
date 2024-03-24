public class Main {
	public static void main(String[] args) {
		
		boolean[] self = new boolean[10001];
		for(int i = 1 ; i <= 10000 ; i++) {
			int num = selfCheck(i);
			if(num<=10000) {
				self[num] = true;
			}		
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i < self.length ; i++) {
			if(!self[i]) sb.append(i).append("\n");
		}
		System.out.println(sb.toString());
	}
	public static int selfCheck(int num) {
		int sum = num;
		while(num!=0) {
			sum+=(num%10);
			num/=10;
		}		
		return sum;
	}
}