class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A","0").replace("B", "A").replace("0","B");	
        return myString.contains(pat)?1:0;
    }
}