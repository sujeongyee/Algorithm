import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        String answer = s.repeat(n);
        System.out.println(answer);
    }
}