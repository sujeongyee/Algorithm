class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();		
		for(int i = 0 ; i < my_string.length() ; i++) {
			String s = String.valueOf(my_string.charAt(i));
			if(sb.indexOf(s)<0) sb.append(s);
		}
        return sb.toString();
    }
}