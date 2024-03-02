class Solution {
    public int solution(String t, String p) {
        int count = 0;
		long pnum = Long.parseLong(p);
		for(int i = 0 ; i < t.length(); i++) {
			if(t.length()-i>=p.length()) {
				long tnum = Long.parseLong(t.substring(i, i+p.length()));				
				if(tnum<=pnum) count++;				
			}			
		}
        return count;
    }
}