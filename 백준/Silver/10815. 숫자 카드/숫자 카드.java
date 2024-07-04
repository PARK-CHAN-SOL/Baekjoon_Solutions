import java.util.HashSet;

public class Main {
    
	static int readInt() throws Exception {
		int c, n = System.in.read() & 15;
		boolean isNegative = n == 13;
		if (isNegative) n = System.in.read() & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		if (isNegative) return ~n + 1;
		return n;
	}

	public static void main(String[] args) throws Exception {
		int n = readInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		StringBuilder sb = new StringBuilder();
        
		for (int i = 0; i < n; i++) hs.add(readInt());
        
		int m = readInt();
        
		for (int i = 0; i < m; i++) {
			if (hs.contains(readInt())) sb.append(1).append(" ");
			else
				sb.append(0).append(" ");
		}
        
		System.out.println(sb);
	}

}
