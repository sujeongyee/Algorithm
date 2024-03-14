class Solution {
    public int solution(int[] num_list) {
        String odd = "";
		String even = "";
		
		for(int a : num_list) {
			if(a%2!=00) odd+= Integer.toString(a);
			else even+= Integer.toString(a);
		}
        return Integer.parseInt(odd)+Integer.parseInt(even);
    }
}