import java.io.IOException;

public class Main {

	static int read() throws IOException {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32)	n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}
	
	public static void main(String[] args) throws IOException {
		int n = read();
		if(n == 1) return;
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				sb.append(i).append("\n");
				n /= i--;
			}
		}
		sb.append(n);
		System.out.println(sb);
	}

}
