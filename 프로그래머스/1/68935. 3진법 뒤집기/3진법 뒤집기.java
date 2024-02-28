class Solution {
    public int solution(int n) {
        String num = "";
		StringBuilder sb = new StringBuilder();
		while(true) {
			sb.insert(0, n%3+"");
			if(n<3) break;
			n /= 3;			
		}		
		String san = sb.reverse().toString();		
		int sum = 0;
		for(int i = san.length()-1 ; i>=0 ; i--) {
			int x = 1;
			for(int j = 0; j<Math.abs(i-san.length()+1);j++) {
				x*=3;
			}			
			sum+= (Integer.parseInt(san.charAt(i)+"")*x);
		}
        return sum;
    }
}