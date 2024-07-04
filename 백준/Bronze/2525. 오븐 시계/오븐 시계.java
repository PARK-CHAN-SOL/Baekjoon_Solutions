public class Main{
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    public static void main(String[] args) throws Exception {
        
        int h = readPosInt();
        int m = readPosInt();
        int o = readPosInt();
        
        m = m + o;
        
        if(m >= 60){
            h = h + m / 60;
            m = m % 60;
            if(h >= 24){
                h = h - 24;
            }
        }
        
        System.out.print(h + " " + m);
        
    }
}