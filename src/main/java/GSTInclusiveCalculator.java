public class GSTInclusiveCalculator {
    public static void main(String[] args) {
        for (int i = 1; i <= 23; i++) {
            System.out.println("Days : "+i+"\tSalary : "+inHandSalary(i,1700,18));
        }
    }

    public static double inHandSalary(int days, int hourlyRate,int gstPercentage){
        int totalBillToClient = days * 8 * hourlyRate;

        int gstAmount = totalBillToClient * gstPercentage / (100 + gstPercentage);

        int tenPercentFlatTax = totalBillToClient / 10;

        return totalBillToClient - (gstAmount + tenPercentFlatTax);
    }
}
