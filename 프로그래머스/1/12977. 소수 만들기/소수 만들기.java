class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0 ; i < nums.length ; i++) {
			for(int j = i+1 ; j < nums.length ; j++) {
				for(int k = j+1 ; k < nums.length ; k++) {
					int sum = nums[i]+nums[j]+nums[k];
					if(sum%2==0) continue;
					else if(sum%3==0) continue;
					else if (sum%5==0) continue;
					else {
						int cnt = 0;
						for(int l = 2; l<= Math.sqrt(sum) ; l++) {
							if(sum%l==0) {
								cnt++;
								break;
							}
						}
						if(cnt==0) answer++;
					}
				}
			}
		}

        return answer;
    }
}