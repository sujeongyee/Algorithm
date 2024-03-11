class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
		for(int i = 0 ; i < n ; i++) {
			String a = Integer.toBinaryString(arr1[i]);
			String b = Integer.toBinaryString(arr2[i]);
			if(a.length()!=n) a = "0".repeat(n-a.length())+a;
			if(b.length()!=n) b = "0".repeat(n-b.length())+b;
			String code = "";
			for(int j = 0 ; j < n; j++) {
				if(Character.toString(a.charAt(j)).equals("0")&&Character.toString(b.charAt(j)).equals("0")) code+=" ";
				else code+="#";
			}
			answer[i] = code;
		}
        return answer;
    }
}