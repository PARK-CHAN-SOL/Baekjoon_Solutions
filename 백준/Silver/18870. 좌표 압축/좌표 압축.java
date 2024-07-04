import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	static int[] xArrTmp;
	static int[] idxArrTmp;
	
	static int readPosInt() throws IOException {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}

	static int readInt() throws IOException {
		int c, n = System.in.read() & 15;
		boolean isNegative = n == 13;
		if (isNegative) n = System.in.read() & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		if (isNegative) return ~n + 1;
		return n;
	}

	static void mergeSort(int[] xArr, int[] idxArr, int startPoint, int endPoint) {
		if (startPoint < endPoint) {
			int sepPoint = (startPoint + endPoint) / 2;
			mergeSort(xArr, idxArr, startPoint, sepPoint);
			mergeSort(xArr, idxArr, sepPoint + 1, endPoint);
			merge(xArr, idxArr, startPoint, sepPoint, endPoint);
		}
	}

	static void merge(int[] xArr, int[] idxArr, int startPointer, int sepPointer, int endPointer){
	        int leftPointer = startPointer;
	        int rightPointer = sepPointer+1;
	        int tmpPointer = startPointer;
	        while(leftPointer <= sepPointer && rightPointer <= endPointer){
	            if(xArr[leftPointer] <= xArr[rightPointer]) {
	            	xArrTmp[tmpPointer] = xArr[leftPointer];
	            	idxArrTmp[tmpPointer] = idxArr[leftPointer];
	            	leftPointer++;
	            }
	            else {
	            	xArrTmp[tmpPointer] = xArr[rightPointer];	    
	            	idxArrTmp[tmpPointer] = idxArr[rightPointer];
	            	rightPointer++;
	            }
	            tmpPointer++;
	        }
	        while(leftPointer <= sepPointer) {
	            xArrTmp[tmpPointer] = xArr[leftPointer];
	            idxArrTmp[tmpPointer] = idxArr[leftPointer];
	            tmpPointer++;
	            leftPointer++;
	        }
	        while(rightPointer <= endPointer) {
	            xArrTmp[tmpPointer] = xArr[rightPointer];
	            idxArrTmp[tmpPointer] = idxArr[rightPointer];
	            tmpPointer++;
	            rightPointer++;
	        }
	        
	        for(int i = startPointer; i <= endPointer; i++){
	            xArr[i] = xArrTmp[i];
	            idxArr[i] = idxArrTmp[i];
	        }
	    }

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		int n = readPosInt();
		int[] xArr = new int[n];
		int[] idxArr = new int[n];
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			xArr[i] = readInt();
			idxArr[i] = i;
		}

		xArrTmp = xArr.clone();
		idxArrTmp = idxArr.clone();
		
		mergeSort(xArr, idxArr, 0, n-1);
		
		int count = 0;
		int dupChk = xArr[0];
		for(int i = 0; i < n; i++) {
			if(dupChk == xArr[i]) {
				result[idxArr[i]] = count;
			} else {
				dupChk = xArr[i];
				result[idxArr[i]] = ++count;
			}
		}

		for(int i = 0; i < n; i++) {
			sb.append(result[i]).append(" ");
		}
		
		System.out.print(sb);
	}

}
