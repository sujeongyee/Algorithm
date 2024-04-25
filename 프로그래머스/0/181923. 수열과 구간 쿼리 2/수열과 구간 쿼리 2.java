class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
		int idx = 0;
		for(int i = 0 ; i < queries.length ; i++) {
			int max = 1000000;
			for(int j = queries[i][0]; j <= queries[i][1]; j++) {
				if(arr[j]<max && arr[j]>queries[i][2]) {
					max = arr[j];
				}
			}
			answer[idx] = max==1000000?-1:max ; 
			idx++;
		}
        return answer;
    }
}