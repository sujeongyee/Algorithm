class Solution {
    public int solution(int[][] lines) {
        boolean[] check = new boolean[201];
		boolean[] check2 = new boolean[201];
		int cnt = 0;
		for(int i = 0 ; i < lines.length ; i++) {
			for(int j = lines[i][0] ; j < lines[i][1] ; j++) {
				if(check[j+100]) {
					if(!check2[j+100]) {
						cnt++;
						check2[j+100] = true;
					}					
				}else {
					check[j+100]=  true;
				}
			}
		}
        return cnt;
    }
}