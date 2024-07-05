import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int pointer = 0;
    static int tmpPointer = 0;
    static int next = 1;
    static int[] students;
    static int[] studentsTmp;
    static int n;
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static boolean chkStudents () {
        if(next == n) return true;
        
        while(true){
            if(pointer == n || tmpPointer == n) return false;
            if(students[pointer] != next){
                studentsTmp[tmpPointer++] = students[pointer++];
                if(tmpPointer > 1 && studentsTmp[tmpPointer-2] < studentsTmp[tmpPointer-1]) return false;
                continue;
            }
            
            if(++next == n) return true;
            
            pointer++;
            
            if(tmpPointer == 0) continue;
            
            while(studentsTmp[tmpPointer-1] == next){
                tmpPointer--;
                if(++next == n) return true;
                if(tmpPointer == 0) break;
            }
            
        }
    }
    
    public static void main(String[] args) throws Exception {
        n = readPosInt();
        students = new int[n];
        studentsTmp = new int[n];

        for(int i = 0; i < n; i++){
            students[i] = readPosInt();
        }

        System.out.print(chkStudents()?"Nice":"Sad");
    }
}