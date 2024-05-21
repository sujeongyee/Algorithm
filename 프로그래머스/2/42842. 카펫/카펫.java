class Solution {
    public int[] solution(int brown, int yellow) {
        int square = brown + yellow ; 
		int[] answer = new int[2];
		for(int height = 3; height < square ; height++) {
			if(square%height==0) {
				int width = square/height;
				if((width-2)*(height-2)==yellow) {
					answer[0] = width;
					answer[1] = height;
					break;
				} 
			}
		}
        return answer;
    }
}