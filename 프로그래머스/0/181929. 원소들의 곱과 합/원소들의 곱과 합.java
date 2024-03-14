class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
		int times = 1;
        for(int num: num_list) {
			sum+=num;
			times*=num;
		}
		
		return times<Math.pow(sum, 2)?1:0;
    }
}