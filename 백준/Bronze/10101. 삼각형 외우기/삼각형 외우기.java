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
        
		if (a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
		} else if (a + b + c == 180) {
			if(a == b || b == c || c == a) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		} else {
			System.out.println("Error");
		}
	}

}
