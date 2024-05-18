import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
		List<String> list = new ArrayList<String>();
		Arrays.stream(arr).forEach(i->list.add(i));
		for(int i = 0 ; i < list.size() ; i++) {
			if(i%2==1 && list.get(i).contains("x")) {
				String prev = list.get(i-1);
				String next = list.get(i+1);
				list.remove(i-1);
				list.remove(i-1);
				list.remove(i-1);
				if(!prev.contains("x")&&!next.contains("x")) {
					int p = Integer.parseInt(prev);
					int n = Integer.parseInt(next);
					list.add(i-1, String.valueOf(p*n));
				} else {
					prev=prev.replace("x", "");
					next=next.replace("x", "");
					int p = prev.length()==0?1:Integer.parseInt(prev);
					int n = next.length()==0?1:Integer.parseInt(next);
					list.add(i-1, (p*n)+"x");
				}
				i-=2;
			}
		}
		int xSum = 0;
		int sum = 0;
		for(int i = 0 ; i < list.size() ; i+=2) {
			String s = list.get(i);
			if(s.contains("x")){
				s = s.replace("x", "");
				if(s.length()==0) xSum+=1;
				else {
					xSum+=Integer.parseInt(s);
				}
				
			}else {
				sum+=Integer.parseInt(s);
			}
		}
		StringBuilder sb = new StringBuilder();
		if(xSum>0) {
			if(xSum==1) {
				sb.append("x");
			}else {
				sb.append(xSum+"x");
			}
			if(sum>0) sb.append(" + ");
		}
		if(sum>0) {
			sb.append(sum);
		}
        return sb.toString();
    }
}