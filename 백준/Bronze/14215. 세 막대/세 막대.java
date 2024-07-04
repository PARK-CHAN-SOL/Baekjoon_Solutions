import java.io.IOException;

public class Main {
    
	static int read() throws IOException {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}

	public static void main(String[] args) throws IOException {
		int a = read();
		int b = read();
		int c = read();
		int sum = 0;
		
		if (a >= b + c) {
			sum = b + b + c + c - 1;
		} else if (b >= a + c) {
			sum = a + a + c + c - 1;
		} else if (c >= a + b) {
			sum = a + a + b + b - 1;
		} else {
			sum = a + b + c;
		}
		
		System.out.println(sum);
	}

}
