import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = sosu(n);
		Set<Integer> list2 = new HashSet<>();		
		while(n!=1) {
			for(int i = 0 ; i < list.size() ; i++) {
				if(n%list.get(i)==0) {
					n/=list.get(i);
					list2.add(list.get(i));
					break;
				}
			}
			
		}
		int[] answer = list2.stream().sorted().mapToInt(i->i).toArray();
        return answer;
    }
    
    public List<Integer> sosu(int n) {
		List<Integer> list = new ArrayList<>();		
		for(int i = 2; i <= n ; i++) {
			int cnt = 0;
			for(int j = 2; j <=Math.sqrt(i) ; j++) {
				if(i%j==0) {
					cnt++;
					break;
				}
			}
			if(cnt==0) list.add(i);
		}
		return list;
	}
}