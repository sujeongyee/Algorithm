class Solution {
    public int solution(int[][] sizes) {
        int min = 0;
		int max = 0;
		int a,b;
		for(int i = 0 ; i < sizes.length ; i++) {			
			a = sizes[i][0]>sizes[i][1]?sizes[i][0]:sizes[i][1];
			b = sizes[i][0]<sizes[i][1]?sizes[i][0]:sizes[i][1];
			min = b>min?b:min;
			max = a>max?a:max;				
		}
        return min*max;
    }
}