class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length!=arr2.length) {
			if(arr2.length>arr1.length) return -1;
			else return 1;
		} else {		
			int sum1 = 0;
			int sum2 = 0;
			
			for(int i = 0 ; i < Math.max(arr1.length, arr2.length) ; i++) {
				if(i<arr1.length) sum1+=arr1[i];
				if(i<arr2.length) sum2+=arr2[i];
			}
			
			if(sum1==sum2) return 0;
			else if (sum1>sum2) return 1;
			else return -1;
		}
    }
}