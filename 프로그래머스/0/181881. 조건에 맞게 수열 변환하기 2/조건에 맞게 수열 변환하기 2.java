class Solution {
    public int solution(int[] arr) {
        int answer = 0;
		while(true) {
			int cnt = 0;
			for(int i = 0 ; i < arr.length ; i++) {
				int n = arr[i];
				if(n>=50 && n%2==0) {
					arr[i] = n/2;
				}else if (n<50 && n%2==1){
					arr[i] = n*2+1;
				}else {
					cnt++;
				}
			}
			if(cnt == arr.length) break;
			answer++;
		}
        return answer;
    }
}