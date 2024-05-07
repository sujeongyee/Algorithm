import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String,String> map = new HashMap<String, String>();
		for(int i = 0 ; i < db.length ; i++) {
			map.put(db[i][0], db[i][1]);
		}
		String answer = "";
		if(map.containsKey(id_pw[0])) {
			answer = map.get(id_pw[0]).equals(id_pw[1])?"login":"wrong pw";
		}else {
			answer="fail";
		}
        return answer;
    }
}