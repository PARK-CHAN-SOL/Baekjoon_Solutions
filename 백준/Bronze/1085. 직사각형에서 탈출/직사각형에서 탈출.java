import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 int x = Integer.parseInt(st.nextToken());
		 int y = Integer.parseInt(st.nextToken());
		 int w = Integer.parseInt(st.nextToken());
		 int h = Integer.parseInt(st.nextToken());
        
		 if(x + x - w > 0) x = w - x;
		 if(y + y - h > 0) y = h - y;
		 if(x - y > 0) {
			 System.out.println(y);
		 } else {
			 System.out.println(x);
		 }		 
	}
}
