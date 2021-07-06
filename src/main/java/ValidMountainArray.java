class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int i = 0;
        
        while(i < A.length - 1 && A[i] < A[i + 1]) // going to top of mountain (peak) element
            i += 1;
        
        if(i == 0 || i >= A.length -1)      //if peak element is first or last. then it is not valid mountain array.
            return  false;
        
        while(i < A.length - 1){ // after peak element elments should be decrease. not increasing.
            if(A[i] <= A[i + 1])
                return false;
            i++;
        }
        
        return true;
    }
}
