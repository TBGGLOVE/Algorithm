import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		
		
		String[] tokens = b.split("");
        int b3 = Integer.parseInt(tokens[0]);
        int b2 = Integer.parseInt(tokens[1]);
        int b1 = Integer.parseInt(tokens[2]);
        int n = Integer.parseInt(b);

        System.out.println(a * b1);
        System.out.println(a * b2);
        System.out.println(a * b3);
        System.out.println(a * n);
		
	}

}
