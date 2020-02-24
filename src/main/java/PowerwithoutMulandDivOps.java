/**
 * @author Srinivas_Chintakindhi
 */

public class PowerwithoutMulandDivOps {
    public int pow(int a,int b){
        if(b == 0)
            return 1;

        int answer = 0;
        int increment = a;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                answer += increment;
            }
            increment = answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        int pow = new PowerwithoutMulandDivOps().pow(5, 3);
        System.out.println("pow = " + pow);
    }
}
