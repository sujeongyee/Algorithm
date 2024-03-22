import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr= new int[26];
		try {
			String word = br.readLine();
			word=word.toUpperCase();
			for(char c:word.toCharArray()) {
				arr[c-65]++;
			}
			int max = -1;
			int index = 0;
			int max2 = 0;
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i]>max) {
					max = arr[i];
					index=i;
				}else if(arr[i]==max) max2 = arr[i];
			}
			
			if(max==max2) System.out.println("?");
			else System.out.println((char)(index+65));
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}
}