import java.io.IOException;
public class Main {

    static int read() throws IOException {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32)	n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}
	
	public static void main(String[] args) throws IOException {
	    System.out.println(read()*read());	
	}
}
