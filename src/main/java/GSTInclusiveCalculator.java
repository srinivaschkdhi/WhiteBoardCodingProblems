import java.text.DecimalFormat;

public class GSTInclusiveCalculator {
    private static final int HOURLY_RATE = 1700;
    private static final int GST_PERCENTAGE = 18;
    private static final int WORK_HOURS_PER_DAY = 8;
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        printHeader();
        calculateTaxesAndSalaryInHand();
        printFooter();
    }

    private static void printHeader() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(" Taxes and Salary");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-15s | %18s |%12s |%10s |%n", "DAYS", "STANDARD 10% TAX", "GST 18% INCLUSIVE", "TOTAL TAX", "IN HAND SALARY");
        System.out.println("----------------------------------------------------------------------------------------");
    }

    private static void calculateTaxesAndSalaryInHand() {
        for (int i = 1; i <= 23; i++) {
            int days = i;
            int totalBillToClient = days * WORK_HOURS_PER_DAY * HOURLY_RATE;
            double gstAmount = totalBillToClient * GST_PERCENTAGE / (100 + GST_PERCENTAGE);
            int tenPercentFlatTax = totalBillToClient / 10;
            double inHandSalary = totalBillToClient - (gstAmount + tenPercentFlatTax);
            printResult(days, tenPercentFlatTax, gstAmount, (gstAmount + tenPercentFlatTax), inHandSalary);
        }
    }

    private static void printResult(int days, int tenPercentFlatTax, double gstAmount, double totalTax, double inHandSalary) {
        String formattedGstAmount = DECIMAL_FORMAT.format(gstAmount);
        String formattedTotalTax = DECIMAL_FORMAT.format(totalTax);
        String formattedInHandSalary = DECIMAL_FORMAT.format(inHandSalary);

        System.out.printf("| %-10d | %-15d | %18s | %-12s | %-10s |%n", days, tenPercentFlatTax, formattedGstAmount, formattedTotalTax, formattedInHandSalary);
        System.out.println("----------------------------------------------------------------------------------------");
    }

    private static void printFooter() {
        System.out.println("----------------------------------------------------------------------------------------");
    }
}
