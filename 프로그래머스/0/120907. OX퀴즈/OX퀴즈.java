class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
		for(int i = 0 ; i < quiz.length ; i++) {
			String[] arr = quiz[i].split(" ");
			int a = Integer.parseInt(arr[0]);
			String buho = arr[1];
			int b = Integer.parseInt(arr[2]);
			int dab = Integer.parseInt(arr[4]);
			if(buho.equals("+")) {
				answer[i]= a+b==dab?"O":"X";
			}else {
				answer[i]= a-b==dab?"O":"X";
			}			
		}
        return answer;
    }
}