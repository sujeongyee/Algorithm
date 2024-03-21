// import java.util.ArrayList;
// import java.util.List;
// class Solution {
//     public int[] solution(int n, int k) {
//         List<Integer> list = new ArrayList<>();
// 		for(int i = k ; i <=n ; i+=k ) {
// 			list.add(i);
// 		}		
//         return list.stream().mapToInt(i->i).toArray();
//     }
// }

// 위에 풀이보다 성능 좋은 코드로 수정

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[(n-k)/k+1];
		int idx = 0;
		for(int i = k ; i <=n ; i+=k ) {
			answer[idx] = i;
			idx++;
		}
        return answer;
    }
}
