class Solution {
    public String solution(int a, int b) {
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int daySum = b-1;
		
		for(int i = 0 ; i < a-1 ; i++) {
			daySum+= month[i];
		}
        return day[daySum%7];
    }
}