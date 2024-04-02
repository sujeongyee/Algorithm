class Solution {
    public int solution(int[] array, int n) {
        int cha = 100;
		int min = 0;
		for(int i = 0 ; i < array.length ; i++) {
			if(Math.abs(array[i]-n)<cha) {
				cha = Math.abs(array[i]-n);
				min = array[i];
			}else if (Math.abs(array[i]-n)==cha){
				min = array[i]<min?array[i]:min;
			}
		}
        return min;
    }
}