import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<String>();
		set.add(words[0]);
		int wrong = -1;
		int[] answer = new int[2];
		for(int i = 1 ; i < words.length ; i++) {
			if(words[i].length()<=1) {
				wrong=i;
				break;
			}
			char prev = words[i-1].charAt(words[i-1].length()-1);
			char now = words[i].charAt(0);
			if(prev!=now) {
				wrong = i;
				break;
			}
			int len = set.size();
			set.add(words[i]);

			if(set.size()==len) {
				wrong = i;
				break;
			}
		}
		if(wrong==-1) {
			answer[0] = 0;
			answer[1] = 0;
		}else {
			wrong+=1;
			answer[0] = wrong%n==0? n : wrong%n;
			answer[1] = wrong%n==0? wrong/n:wrong/n+1;
		}

        return answer;
    }
}