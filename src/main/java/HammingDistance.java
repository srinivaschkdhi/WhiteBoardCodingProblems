public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int numOfDiff = 0;
        
        while(x > 0 || y > 0){
            numOfDiff += (x % 2) ^ (y % 2);
            
            x >>= 1;
            y >>= 1;
        }
        
        return numOfDiff;
    }

    public int hammingDistance2(int x, int y) {
        int numOfDiffPos = 0;
        
        while(x > 0 || y > 0){
            int bit1 = x % 2;
            int bit2 = y % 2 ;
            
            int xorResl = bit1 ^ bit2;
            
            if(xorResl == 1){
                numOfDiffPos += 1;   
            }
            
            x >>= 1;
            y >>= 1;
        }
        
        return numOfDiffPos;
    }
}
