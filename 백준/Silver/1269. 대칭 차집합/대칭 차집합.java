import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	static int readPosInt() throws IOException {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}
	
	static int readInt() throws IOException {
		int c, n = System.in.read() & 15;
		boolean isNegative = n == 13;
		if(isNegative) n = System.in.read() & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		if(isNegative) return ~n+1;
		return n;
	}
	
	public static void main(String[] args) throws IOException{

		Set<Integer> aUb = new HashSet<Integer>();
		int n = readPosInt();
		int m = readPosInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			aUb.add(readInt());
		}
		
		for(int i = 0; i < m; i++) {
			if(aUb.contains(readInt()))	count++;
		}
		
		count = n + m - (count + count);
		System.out.println(count);
	}

}
