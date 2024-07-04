import java.io.IOException;

public class Main {

	static int read() throws IOException {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}

	public static void main(String[] args) throws IOException {
		int x1 = read();
		int y1 = read();
		int x2 = read();
		int y2 = read();
		int x3 = read();
		int y3 = read();
		StringBuilder sb = new StringBuilder();
		
		if(x1 - x2 == 0) {
			sb.append(x3).append(" ");
		} else if (x1 - x3 == 0) {
			sb.append(x2).append(" ");
		} else {
			sb.append(x1).append(" ");
		}
		
		if(y1 - y2 == 0) {
			sb.append(y3);
		} else if (y1 - y3 == 0) {
			sb.append(y2);
		} else {
			sb.append(y1);
		}
		
		System.out.println(sb);

	}

}
