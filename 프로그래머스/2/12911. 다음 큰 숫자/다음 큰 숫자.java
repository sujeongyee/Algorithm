class Solution {
    public int solution(int n) {
        int answer = 0;
        String n2 = Integer.toBinaryString(n);
		int len = n2.length();
		int len2 = n2.replace("1", "").length();	
		int len3 = len-len2; 
		n++;
        while(true) {
        	if(check(len3,n)) {
        		answer = n;
        		break;
        	}
        	n++;
        }
        return answer;
    }
    public boolean check(int len,int n) {
		String n2 = Integer.toBinaryString(n);
		int length = n2.length();
		int length2 = n2.replace("1", "").length();
		if(len==(length-length2)) return true;
		else return false;
	}
}