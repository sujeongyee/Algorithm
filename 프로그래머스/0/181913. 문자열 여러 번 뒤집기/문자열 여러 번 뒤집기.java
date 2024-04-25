class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb= new StringBuilder(my_string);

		for(int i = 0 ; i < queries.length ; i++) {
			StringBuilder sb2 = new StringBuilder(sb.substring(queries[i][0], queries[i][1]+1));
			sb=sb.delete(queries[i][0], queries[i][1]+1);				
            sb.insert(queries[i][0], sb2.reverse());
			
		}
        return sb.toString();
    }
}