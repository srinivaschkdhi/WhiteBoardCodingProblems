public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        
        for(int bill : bills){
            if(bill == 5)
                fives ++;
            else if(bill == 10){
                tens++;
                fives--;
            }else if(bill == 20 && tens > 0){
                tens--;
                fives--;
            }
            else if(bill == 20 && tens == 0)
                fives= fives - 3;
            
            if(fives < 0)
                return false;
                
        }
        
        return true;
    }
}
