import java.io.IOException;

public class Main {

	static int read() throws IOException {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}

	public static void main(String[] args) throws IOException {
		int n = read();
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[10001];

		for (int i = 0; i < n; i++) {
			arr[read()]++;
		}

		for (int i = 1; i < 10001; i++) {
			for (int j = 0; j < arr[i]; j++) {
				sb.append(i).append("\n");
			}
		}

		System.out.print(sb);
	}
}
