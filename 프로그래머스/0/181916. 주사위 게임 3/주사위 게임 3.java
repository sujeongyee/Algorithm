import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a,b,c,d};
		
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		int answer = 0;
		
		for(int i = 0 ; i < dice.length ; i++) {
			if (map.containsKey(dice[i])) {
				map.put(dice[i],map.get(dice[i])+1);
			}else {
				map.put(dice[i],1);
			}
		}
		
		if(map.size() == 1) answer= 1111* a;
		else if (map.size()==4) answer = Math.min(Math.min(a,b), Math.min(c,d));
		else if (map.size()==3) {
			for(int n : map.keySet()) {
				if(map.get(n)==2) {
					answer = 1;
					for(int n2 : map.keySet()) if(n2 != n) answer*=n2;
				}
			}
		}else if (map.size()==2) {
			int p1 = 0;
			int p2 = 0;
			int cnt = 0;
			for(int n : map.keySet()) {
				if(map.get(n)==2) {
					if(cnt ==0) p1 = n;
					else p2 = n;
					cnt++;
				}
				if(map.get(n)==3) {
					int q = (n!=a)? a : (n!=b)? b: (n!=c) ? c : (n!=d) ? d : 0;
					answer = (10 * n + q) * (10 * n + q);
				}
			}
			if(cnt==2) answer = (p1+p2) * Math.abs(p1-p2);
			
		}
        return answer;
    }
}