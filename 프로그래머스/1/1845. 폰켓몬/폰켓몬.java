import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int a = nums.length;
		int b = Arrays.stream(nums).distinct().toArray().length;
		return b>a/2?a/2:b;
    }
}