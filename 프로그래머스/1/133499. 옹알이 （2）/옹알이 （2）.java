class Solution {
    public int solution(String[] babbling) {
		int cnt = 0;
		String[] pro = {"aya", "ye", "woo", "ma"};		
		for(int i = 0 ; i < babbling.length ; i++) {
			String s = babbling[i];
			if(s.contains("ayaaya")||s.contains("yeye")||s.contains("woowoo")||s.contains("mama")) continue;
			else {
				for(int j = 0 ; j < pro.length ; j++) {
					s=s.replace(pro[j], "h");
				}
			}			
			if(s.replace("h","").length()==0) cnt++;
		}
        return cnt;
    }
}