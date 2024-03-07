import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);
		List<Integer> list = new ArrayList<>();
		int index = -1;
		list.add(-1);
		for(int i = 1 ; i < sb.length() ; i++) {
			for(int j = i-1 ; j >=0 ; j--) {
				if(sb.charAt(i)==sb.charAt(j)) {
					index = i-j;
					break;
				}
			}
			list.add(index);
			index = -1;
		}
        return list.stream().mapToInt(i->i).toArray();
    }
}