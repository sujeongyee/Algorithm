class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]-0==32){ // 공백 
				sb.append(" ");
				cnt = 0;
			}else if(cnt==0) {
				sb.append(String.valueOf(arr[i]).toUpperCase());
				cnt++;
			}else if(cnt!=0) {
				sb.append(String.valueOf(arr[i]).toLowerCase());
			}
		}

        return sb.toString();
    }
}