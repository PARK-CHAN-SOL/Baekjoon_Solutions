import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        StringTokenizer st;
        double sumTotal = 0;
        int sumCredit = 0;
        
        while((s = br.readLine()) != null){
            st = new StringTokenizer(s);
            st.nextToken();
            int credit = st.nextToken().charAt(0)-48;
            switch (st.nextToken()) {
                case "A+": sumTotal += 4.5 * credit; break;
                case "A0": sumTotal += 4.0 * credit; break;
                case "B+": sumTotal += 3.5 * credit; break;
                case "B0": sumTotal += 3.0 * credit; break;
                case "C+": sumTotal += 2.5 * credit; break;
                case "C0": sumTotal += 2.0 * credit; break;
                case "D+": sumTotal += 1.5 * credit; break;
                case "D0": sumTotal += 1.0 * credit; break;
                case "P": sumCredit -= credit;break;
                default: break; 
            }
            sumCredit += credit;
        }

        bw.write(sumTotal/sumCredit + "");
        
        bw.close();
        br.close();
    }
}