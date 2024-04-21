import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        int lIndex = -1;
		int rIndex = -1;
		for(int i = 0 ; i < str_list.length ; i++) {
			if(str_list[i].equals("l")) {
				lIndex=i;
				break;
			}else if(str_list[i].equals("r")) {
				rIndex=i;
				break;
			} 
		}
		if(lIndex==-1&&rIndex==-1) {
			return new String[] {};
		}else if(lIndex!=-1) {
			if(lIndex!=0) {
				return Arrays.copyOfRange(str_list, 0, lIndex);
			}else {
				return new String[] {};
			}
		}else {
			if(rIndex!=str_list.length-1) {
				return Arrays.copyOfRange(str_list, rIndex+1, str_list.length);
			}else {
				return new String[] {};
			}
		}
    }
}