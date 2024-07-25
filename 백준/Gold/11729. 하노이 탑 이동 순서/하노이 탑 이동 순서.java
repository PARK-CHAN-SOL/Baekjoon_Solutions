import java.io.*;

class Main {
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = readPosInt();
        int count = (1 << n) - 1;

        char[] seq = "1 3\n".toCharArray();
        char[] tmp;

        for (int i = 1; i < n; i++) {
            tmp = new char[seq.length * 2 + 4];
            int ptr = 0;

            for (int j = 0; j < seq.length; j++) {
                if (seq[j] == '3') tmp[ptr++] = '2';
                else if (seq[j] == '2') tmp[ptr++] = '3';
                else tmp[ptr++] = seq[j];
            }
            tmp[ptr++] = '1';
            tmp[ptr++] = ' ';
            tmp[ptr++] = '3';
            tmp[ptr++] = '\n';

            for (int j = 0; j < seq.length; j++) {
                if (tmp[j] == '3') tmp[ptr++] = '1';
                else if (tmp[j] == '2') tmp[ptr++] = '3';
                else if (tmp[j] == '1') tmp[ptr++] = '2';
                else tmp[ptr++] = seq[j];
            }

            seq = tmp;
        }

        writer.write(count + "\n");
        writer.write(seq);
        writer.flush();
    }
}
