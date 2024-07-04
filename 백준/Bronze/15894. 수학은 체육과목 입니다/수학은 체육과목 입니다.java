import java.io.IOException;

//수학은 체육과목입니다
public class Main {

	static long read() throws IOException{
		long c, n = System.in.read() & 15;
		while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}
    
	public static void main(String[] args) throws IOException {
		System.out.println(read()*4);
	}

}
