class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0; 
		int y = 0;
		for(int i = 0 ; i < keyinput.length ; i++) {
			String s = keyinput[i];
			if(s.equals("left")) x--;
			else if(s.equals("right")) x++;
			else if(s.equals("down")) y--;
			else if(s.equals("up")) y++;
			if(Math.abs(x)>board[0]/2) {
				if(x>0) x--;
				else x++;
			} 
			if(Math.abs(y)>board[1]/2) {
				if(y>0) y--;
				else y++;
			} 
		}
		
		int[] answer = {x,y};
        return answer;
    }
}