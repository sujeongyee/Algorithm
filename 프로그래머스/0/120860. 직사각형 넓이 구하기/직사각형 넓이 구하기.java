class Solution {
    public int solution(int[][] dots) {
        int xmax = Math.max( Math.max(dots[0][0],dots[1][0]),Math.max(dots[2][0],dots[3][0]));
		int xmin = Math.min( Math.min(dots[0][0],dots[1][0]),Math.min(dots[2][0],dots[3][0]));
		int ymax = Math.max( Math.max(dots[0][1],dots[1][1]),Math.max(dots[2][1],dots[3][1]));
		int ymin = Math.min( Math.min(dots[0][1],dots[1][1]),Math.min(dots[2][1],dots[3][1]));
		
		int answer = (xmax-xmin)*(ymax-ymin);
        return answer;
    }
}