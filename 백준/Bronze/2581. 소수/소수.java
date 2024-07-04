import java.io.IOException;

public class Main {

	static int read() throws IOException {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32)	n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}

	public static void main(String[] args) throws IOException {
		int m = read();
		int n = read();
		int sum = 0;
		int min = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = m; i <= n; i++) {
			if (i == 1) continue;
			boolean primeFlag = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					primeFlag = true;
					break;
				}
			}
			if (!primeFlag) {
				sum += i;
				if (min == 0) min = i;
			}
		}
		
		if (sum == 0) {
			System.out.println(-1);
			return;
		}
		
		sb.append(sum).append("\n").append(min);
		System.out.println(sb);
	}

}