class Solution {
    public String solution(String code) {
        StringBuilder sb= new StringBuilder();
		int mode = 0;
		char[] c = code.toCharArray();
		for(int i = 0 ; i < c.length ; i++) {
			if(c[i]=='1') mode = mode==0? 1 : 0;
			else {
				if(mode == 0 && i % 2 == 0) sb.append(c[i]);
				else if(mode == 1 && i % 2 == 1) sb.append(c[i]);
			}
		}
        return sb.length()==0?"EMPTY": sb.toString();
    }
}