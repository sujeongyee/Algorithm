import java.util.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
		
		List<Integer> list = new ArrayList<Integer>();
		long x = 1;
		for(int n : arr) {
			list.add(n);
			x*=n;
		} 
		int answer = 0;
		for(int i = list.get(list.size()-1) ; i<=x ; i++) {
			boolean check = true;
			for(int j = 0 ; j < list.size() ; j++) {
				if(i%list.get(j)!=0) {
					check=false;
					break;
				}
			}
			if(check) {
				answer = i;
				break;
			} 
		}
        return answer;
    }
}