class Solution {
    public String solution(String s, int n) {
        StringBuilder s2 = new StringBuilder(s);
		StringBuilder s3 = new StringBuilder();
		
		for(int i = 0 ; i < s2.length() ; i++) {
			char c = s2.charAt(i);
			if(c==' ') {
				s3.append(" ");
				continue;
			}
			if(c>=97&&c<=122) {
				if(c+n > 122) {
					s3.append((char)(c+n-26));
				}else {
					s3.append((char)(c+n));
				}
			}else {
				if(c+n > 90) {
					s3.append((char)(c+n-26));
				}else {
					s3.append((char)(c+n));
				}
			}
			
		}
        return s3.toString();
    }
}