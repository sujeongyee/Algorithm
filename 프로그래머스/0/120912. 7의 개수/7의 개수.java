class Solution {
    public int solution(int[] array) {
        int answer = 0 ;
		for(int i = 0 ; i < array.length ; i++) {
			int n = array[i];
			while(n!=0) {
				if(n%10==7)answer++;
				n/=10;
			}					
		}
        return answer;
    }
}