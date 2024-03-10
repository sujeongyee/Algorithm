class Solution {
    public int solution(int[] sides) {
        for(int i = 0 ; i < 2 ; i++) {
			if(sides[i]>sides[i+1]) {
				int temp = sides[i];
				sides[i] = sides[i+1];
				sides[i+1] = temp;
			}
			if(i!=0&&sides[i]<sides[i-1]) {
				int temp = sides[i];
				sides[i] = sides[i-1];
				sides[i-1] = temp;
			}
		}
		
		int answer = sides[0]+sides[1]>sides[2]?1:2;
        return answer;
    }
}