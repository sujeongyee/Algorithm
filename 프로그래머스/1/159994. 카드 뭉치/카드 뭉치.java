import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> list1 = new LinkedList<>(Arrays.asList(cards1));
		List<String> list2 = new LinkedList<>(Arrays.asList(cards2));
		
		for(int i = 0 ; i < goal.length ; i++) {			
			if(list1.size()>0 && goal[i].equals(list1.get(0))) {
				list1.remove(0);
			}else if(list2.size()>0 &&goal[i].equals(list2.get(0))) {
				list2.remove(0);
			}else {
				return "No";
			}
		}
        return "Yes";
    }
}