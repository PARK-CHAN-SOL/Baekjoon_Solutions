import java.io.IOException;

public class Main {

	static int read() throws IOException {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
        
		while (true) {
			int a = read();
			int b = read();
			int c = read();
            
			if (a == 0 && b == 0 && c == 0) {
                break;
            } else if (a >= b + c || b >= a + c || c >= b + a) {
				sb.append("Invalid\n");
			} else if (a == b && b == c) {
				sb.append("Equilateral\n");
			} else if (a == b || c == b || a == c) {
				sb.append("Isosceles\n");
			} else {
				sb.append("Scalene\n");
			}
		}
        
		System.out.print(sb);
	}
}
