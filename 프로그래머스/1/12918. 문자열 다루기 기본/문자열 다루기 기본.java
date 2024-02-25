class Solution {
    public boolean solution(String s) {
        int len = s.length();
		if(len!=4 && len!=6) {
			return false;
		}
		s = s.replaceAll("[a-zA-Z]", "");
		
		if (s.length() != len) {
			return false;
		} else {
			return true;
		}
    }
}