public class PowerofTwo {
  public boolean isPowerOfTwo(int n){
    long i = 1;
        
        while(i < n){
            i *= 2;
        }
        
        return (i == n);
    }
}    
