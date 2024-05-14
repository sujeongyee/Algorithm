import java.math.BigInteger;
class Solution {
    public int solution(int n) {
       BigInteger[] arr = {BigInteger.valueOf(0),BigInteger.valueOf(1)};
		BigInteger pibo = BigInteger.valueOf(0);
		for(int i = 2 ; i <=n ; i++) {
			pibo = arr[0].add(arr[1]);
			arr[0] = arr[1];
			arr[1] = pibo;
		}
		BigInteger answer = pibo.remainder(BigInteger.valueOf(1234567) );
		int an = Integer.parseInt( answer.toString());
        return an;
    }
}