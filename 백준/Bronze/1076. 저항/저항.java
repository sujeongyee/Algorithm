
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			String s = br.readLine();
			String s2 = br.readLine();
			String s3 = br.readLine();
			
			long a = value(s,"value")*10+value(s2,"value");
			System.out.println(a * value(s3,"three"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static long value(String s,String type) {
		switch(s) {
		case "black" : return (type.equals("value")? 0 : 1);
		
		case "brown" : return (type.equals("value")? 1 : 10);
		
		case "red" : return (type.equals("value")? 2 : 100);
		
		case "orange" : return (type.equals("value")? 3 : 1000);
		
		case "yellow" : return (type.equals("value")? 4 : 10000);

		case "green" : return (type.equals("value")? 5 : 100000);
		
		case "blue" : return (type.equals("value")? 6 : 1000000);
		
		case "violet" : return (type.equals("value")? 7 : 10000000);
		
		case "grey" : return (type.equals("value")? 8 : 100000000);
		
		case "white" : return (type.equals("value")? 9 : 1000000000);
		
		default : return 0;
		}
	}
}
