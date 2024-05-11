class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(check(i,n)) answer++;
        }
        return answer;
    }
    public boolean check(int n, int sum) {
        int test = 0;
        if(n==sum) return true;
        for(int i = n ; i <= sum ; i++){
            if(test>sum) return false;
            test+=i;
            if(test==sum) return true;
        }
        return false;
    }
}