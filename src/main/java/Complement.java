public class Complement {
    public int findComplement(int num) {
        int result = 0;
        int power = 1;
        
        while(num > 0){
            int bit = num % 2;
            int comp = bit ^ 1;
            result = result + comp * power;
            
            num /= 2;
            power = power << 1;
        }
        
        return result;
    }
}
