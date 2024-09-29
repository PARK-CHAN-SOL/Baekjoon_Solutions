class Solution {
    double[] tmpArr;
    int[] idxTmpArr;
    
    public void mergeSort(int startPtr, int endPtr, double[] arr, int[] idxs){
        if(startPtr < endPtr){
            int seperator = (startPtr + endPtr) >> 1;
            mergeSort(startPtr, seperator, arr, idxs);
            mergeSort(seperator+1, endPtr, arr, idxs);
            merge(startPtr, seperator, endPtr, arr, idxs);
        }
    }
    
    public void merge(int startPtr, int seperator, int endPtr, double[] arr, int[] idxs){
        int i = startPtr;
        int tmpPtr = startPtr;
        int midPtr = seperator + 1;
        while(startPtr <= seperator && midPtr <= endPtr){
            if(arr[startPtr] >= arr[midPtr]){
                tmpArr[tmpPtr] = arr[startPtr];
                idxTmpArr[tmpPtr++] = idxs[startPtr++];
            } else {
                tmpArr[tmpPtr] = arr[midPtr];
                idxTmpArr[tmpPtr++] = idxs[midPtr++];
            }
        }
        while(startPtr <= seperator){
            tmpArr[tmpPtr] = arr[startPtr];
            idxTmpArr[tmpPtr++] = idxs[startPtr++];
        }
        while(midPtr <= endPtr){
            tmpArr[tmpPtr] = arr[midPtr];
            idxTmpArr[tmpPtr++] = idxs[midPtr++];
        }
        for(; i <= endPtr; i++){
            arr[i] = tmpArr[i];
            idxs[i] = idxTmpArr[i];
        }
    }
    
    public int[] solution(int N, int[] stages) {
        double[] arr = new double[N];
        int[] counts = new int[N+2];
        int[] idxs = new int[N];
        tmpArr = new double[N];
        idxTmpArr = new int[N];
        
        int len = stages.length;
        
        for(int i = 0; i < len; i++){
            counts[stages[i]]++;
        }
        
        for(int i = 0; i < N; i++){
            arr[i] = (double)counts[i+1] / len;
            idxs[i] = i + 1;
            len -= counts[i+1];
            if(len == 0) len = 1;
        }
        
        mergeSort(0, N-1, arr, idxs);
        
        return idxs;
    }
}