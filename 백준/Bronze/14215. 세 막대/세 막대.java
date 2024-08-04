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
        int max = a;
		int sum = 0;
		
		if (max < b) max = b;
		if (max < c) max = c;
        int abc = a + b + c;
        if(abc > 2*max){
            sum = abc;
        }else{
            sum = 2 * (abc - max) - 1;
        }
		
		System.out.println(sum);
	}

}
