class Solution {
    public int solution(String[] spell, String[] dic) {
        int ok = spell.length;
		for(int i = 0 ; i < dic.length ; i++) {
			int cnt = 0;
			for(int j = 0 ; j < spell.length ; j++) {
				if(dic[i].contains(spell[j])) {
					cnt++;
					if(cnt == ok) return 1;
				}else {
					break;
				}
			}
		}
		return 2;
    }
}