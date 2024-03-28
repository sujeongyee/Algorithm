class Solution {
    public int solution(int order) {
        String s = Integer.toString(order);
		int count = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			String s2 = String.valueOf(s.charAt(i));
			if(s2.equals("3")||s2.equals("6")||s2.equals("9")) {
				count++;
			}
		}
        return count;
    }
}