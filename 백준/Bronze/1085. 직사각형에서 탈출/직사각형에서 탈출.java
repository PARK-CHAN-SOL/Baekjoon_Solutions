import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

	public static void main(String[] args) throws Exception {
		 int x = readPosInt();
		 int y = readPosInt();
		 int w = readPosInt();
		 int h = readPosInt();
        
		 if((x << 1) - w > 0) x = w - x;
		 if((y << 1) - h > 0) y = h - y;
		 if(x - y > 0) {
			 System.out.println(y);
		 } else {
			 System.out.println(x);
		 }		 
	}
}
