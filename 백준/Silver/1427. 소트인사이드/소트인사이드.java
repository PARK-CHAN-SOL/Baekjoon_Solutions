import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		byte[] br = System.in.readAllBytes();
		Arrays.parallelSort(br);
		StringBuilder sb = new StringBuilder();
		for(int i = br.length-1; i >= 0; i--) {
			sb.append((char)br[i]);
		}
		System.out.println(sb);
	}

}
