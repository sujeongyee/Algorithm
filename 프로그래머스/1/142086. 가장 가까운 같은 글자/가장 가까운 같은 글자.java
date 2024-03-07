
class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);
		int[] list = new int[s.length()];
		int index = -1;
		list[0] = -1;
		for(int i = 1 ; i < sb.length() ; i++) {
			for(int j = i-1 ; j >=0 ; j--) {
				if(sb.charAt(i)==sb.charAt(j)) {
					index = i-j;
					break;
				}
			}
			list[i]=index;
			index = -1;
		}
        return list;
    }
}