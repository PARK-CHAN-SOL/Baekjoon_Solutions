import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int n = readPosInt();
        
        int[] nums = new int[n+1];
        
        int count = (int)Math.pow(2,n)-1;

        for(int i = 0; i < n+1; i++){
            nums[i] = 1;
        }
        
        sb.append(count).append("\n");

        int oddEven = n & 1;
        
        for(int i = 1; i <= count; i++){
            int binary = i;
            int pow = 1;
            
            while((binary & 1) != 1){
                binary >>= 1;
                pow++;
            }
            
            if((pow & 1) == oddEven){
                sb.append(nums[pow]--).append(" ");
                if(nums[pow] == 0) nums[pow] = 3;
                sb.append(nums[pow]).append("\n");
                
            } else {
                sb.append(nums[pow]++).append(" ");
                if(nums[pow] > 3) nums[pow] = 1;
                sb.append(nums[pow]).append("\n");
                
            }
        }

        System.out.print(sb);
    }
}