class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        return solution2(arr,1,1);
    }
    public int[][] solution2(int[][] arr , int cnt, int sequence){

		if(sequence%4==1) {
			for(int i = sequence/4 ; i < arr.length-(sequence/4); i++) {
				arr[sequence/4][i] = cnt;
				if(cnt==arr.length*arr.length) return arr;
				cnt++;
			}
		}else if (sequence%4==2) {
			for(int i = sequence/4+1; i < arr.length-(sequence/4) ; i++) {
				arr[i][arr.length-(sequence/4)-1] = cnt;
				if(cnt==arr.length*arr.length) return arr;
				cnt++;
			}
		}else if (sequence%4==3) {
			for(int i = arr.length-(sequence/4)-2 ; i >= sequence/4 ; i--) {
				arr[arr.length-(sequence/4)-1][i] = cnt;
				if(cnt==arr.length*arr.length) return arr;
				cnt++;
			}
		}else if (sequence%4==0) {
			for(int i = arr.length-(sequence/4)-1 ; i >= sequence/4 ; i--) {
				arr[i][sequence/4-1] = cnt;
				if(cnt==arr.length*arr.length) return arr;
				cnt++;
			}
		}
		sequence++;
		
		if(cnt<=arr.length*arr.length) return solution2(arr,cnt,sequence);
		else return arr;
	}
}