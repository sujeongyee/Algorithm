class Solution {
    public String solution(String letter) {
        String[] arr = letter.split(" ");
		String[] mos = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
		    for(int j = 0 ; j < mos.length; j++) {
		    	if(arr[i].equals(mos[j])) {
		    		sb.append( (char)(j+'a'));
		    	}
		    }
		}
        return sb.toString();
    }
}