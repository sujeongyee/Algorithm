import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] after = new int[N+1];
		int[] now = new int[N+1];
		
		for(int i = 0 ; i < stages.length ; i++) {
			for(int j = 1 ; j <= stages[i] ; j++) {
				if(j<=N) after[j]++;
			}
			if(stages[i]<=N) now[stages[i]]++;
		}
		List<Double> list = new ArrayList<>();
		for(int i = 1 ; i < after.length ; i++) {
			if(now[i]==0 &&after[i]==0) list.add((double)0);
			else list.add((double)now[i]/after[i]);
		}
		double[] arr= list.stream().sorted().mapToDouble(i->i).toArray();
		int[] answer = new int[N];
		int idx = 0;
		for(int i = arr.length-1 ; i>=0 ; i--) { //실패율 큰거부터
			for(int j = 0 ; j < list.size() ; j++) {
				if(arr[i] == list.get(j)) {
					answer[idx] = j+1;
					list.remove(j);
					list.add(j,(double)-1);
					idx++;					
				}
				
			}
		}
        return answer;
    }
}