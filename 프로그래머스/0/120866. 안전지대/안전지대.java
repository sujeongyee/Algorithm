class Solution {
    public int solution(int[][] board) {
        int[][] board2 = new int[board.length+2][board.length+2];
		
		for(int i = 0; i < board.length ; i++) {
			for(int j = 0; j <board.length ; j++) {
				if(board[i][j]==1) {
					for(int k = i ; k<=i+2 ;k++) {
						for(int l = j ; l <= j+2 ; l++) {
							board2[k][l] = 1;
						}
					}
				}
			}
		}
		int answer = 0;
		for(int i  = 1;  i <= board.length ; i++) {
			for(int j = 1 ; j <= board.length ; j++) {
				if(board2[i][j]==0) answer++;
			}
		}
        return answer;
    }
}