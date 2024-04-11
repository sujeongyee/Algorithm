import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        int i = 0 ;
		List<Integer> list = new ArrayList<>();
		while(i<arr.length) {
			if(list.size() == 0) {
				list.add(arr[i]);
			}else if(list.get(list.size()-1)==arr[i]) {
				list.remove(list.size()-1);
			}else if(list.get(list.size()-1)!=arr[i]) {
				list.add(arr[i]);
			}
			i++;
		}
		int[] answer = new int[list.size()];
		for(int j = 0 ; j < answer.length ; j++) {
			answer[j] = list.get(j);
		}
        if(answer.length==0){
            return new int[]{-1};
        }
        return answer;
    }
}