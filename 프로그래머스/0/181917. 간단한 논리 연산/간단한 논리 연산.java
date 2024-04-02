class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean an1 = x1==false&&x2==false?false:true;
		boolean an2 = x3==false&&x4==false?false:true;		
        return an1==true&&an2==true?true:false;
    }
}