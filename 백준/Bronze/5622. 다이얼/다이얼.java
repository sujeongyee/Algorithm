import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			String s = br.readLine();
			int time = 0;
			for(char c : s.toCharArray()) {
				if(c<68) time+=3;
				else if(c<71) time+=4;
				else if(c<74) time+=5;
				else if(c<77) time+=6;
				else if(c<80) time+=7;
				else if(c<84) time+=8;
				else if(c<87) time+=9;
				else time+=10;
			}
			System.out.println(time);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
}
