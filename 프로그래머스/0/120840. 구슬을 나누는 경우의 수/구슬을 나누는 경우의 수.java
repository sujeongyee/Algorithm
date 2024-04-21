import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        BigInteger a = factorial(balls);
		BigInteger b = factorial(balls-share).multiply(factorial(share));
		if(b.toString().equals("0")) {			
			return 0;
		}else {
			return Integer.parseInt(a.divide(b).toString());
		}
    }
    public BigInteger factorial (int n ) {
		BigInteger sum = new BigInteger(String.valueOf("1"));
		for(int i = 1; i <=n ; i++) {
			sum=sum.multiply(new BigInteger(String.valueOf(i)));
		}
		return sum;
	}
}