import java.io.IOException;

public class Main {
	
	static int readNum() throws IOException {
		int c, n = System.in.read() & 15;
		while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}
	
	static void read(StringBuilder[] names) throws IOException {
		int c, n = System.in.read() & 15;
		while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		names[n].append(n).append((char)c);
		while((c = System.in.read()) != 10) names[n].append((char)c);
		names[n].append((char)c);
	}

	public static void main(String[] args) throws IOException {
		StringBuilder[] names = new StringBuilder[201];
		
		for(int i = 0; i <=200; i++) {
			names[i] = new StringBuilder();
		}
		
		int n =	readNum();

		for (int i = 0; i < n; i++) {
			read(names);
		}
		for (int i = 1; i <= 200; i++) {
			names[0].append(names[i]);
		}
		System.out.println(names[0]);
		
	}

}
