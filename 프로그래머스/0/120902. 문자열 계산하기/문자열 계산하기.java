class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
		
		int sum = Integer.parseInt(arr[0]);
		
		for(int i = 2 ; i < arr.length ; i+=2) {
			if(arr[i-1].equals("+")) sum += Integer.parseInt(arr[i]);
			else sum -= Integer.parseInt(arr[i]);
		}
        return sum;
    }
}