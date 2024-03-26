class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();	
		int idx = 1;		
		while( idx < numLog.length) {
			sb.append(numLog[idx]-numLog[idx-1]==1?"w":
				numLog[idx]-numLog[idx-1]==-1?"s":numLog[idx]-numLog[idx-1]==10?"d":"a");
			idx++;
		}
        return sb.toString();
    }
}