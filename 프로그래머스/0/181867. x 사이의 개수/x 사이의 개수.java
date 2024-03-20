class Solution {
    public int[] solution(String myString) {
        if(myString.charAt(myString.length()-1)=='x') {
			myString += "0";
		}
		String[] arr = myString.split("x");
		int[] answer = new int[arr.length];
		
		for(int i = 0 ; i < arr.length ; i++) {
			answer[i] = arr[i].length();
			if(arr[i].equals("0")) answer[i] = 0;
		}
        return answer;
    }
}