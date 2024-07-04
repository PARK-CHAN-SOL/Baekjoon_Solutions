import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split(" ");
		int n = Integer.parseInt(nums[0]);
		int m = Integer.parseInt(nums[1]);
		HashSet<String> hs = new HashSet<String>();
        
		for (int i = 0; i < n; i++) {
			hs.add(br.readLine());
		}
        
		int count = 0;
		for (int i = 0; i < m; i++) {
			if (hs.contains(br.readLine())) count++;
		}
        
		System.out.println(count);
	}

}
