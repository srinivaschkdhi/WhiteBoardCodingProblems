class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int i = 0;
        
        while(i < A.length - 1 && A[i] < A[i + 1])
            i += 1;
        
        if(i == 0 || i >= A.length -1)
            return  false;
        
        while(i < A.length - 1){
            if(A[i] <= A[i + 1])
                return false;
            i++;
        }
        
        return true;
    }
}
