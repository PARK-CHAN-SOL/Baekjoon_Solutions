import java.io.IOException;

public class Main {
	
	static int read() throws IOException {
	    int c, n = System.in.read() & 15;
	    boolean isNegative = n == 13;
	    if (isNegative) n = System.in.read() & 15;
	    while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
	    return isNegative ? ~n + 1 : n;
	}
	
	public static void main(String[] args) throws IOException{
		int n = read();
		int xmin = 10001;
		int xmax = -10001;
		int ymin = 10001;
		int ymax = -10001;
		
		for(int i = 0; i < n; i++){
			int x = read();
			int y = read();
			if(x - xmax > 0) xmax = x;
			if(x - xmin < 0) xmin = x;
			if(y - ymax > 0) ymax = y;
			if(y - ymin < 0) ymin = y;
		}
		int area = (xmax - xmin) * (ymax - ymin);
		System.out.print(area);
	}

}
