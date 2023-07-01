import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

public class GSTInclusiveCalculator {
    private static final int HOURLY_RATE = 1700;
    private static final int GST_PERCENTAGE = 18;
    private static final int WORK_HOURS_PER_DAY = 8;

    public static void main(String[] args) {
        printHeader();
        calculateTaxesAndSalaryInHand();
    }

    private static void printHeader() {
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println(" Taxes and Salary");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-18s | %-16s | %-19s | %-10s | %-15s |%n", "DAYS", "BILL TO CLIENT", "STANDARD 10% TAX", "GST 18% INCLUSIVE", "TOTAL TAX", "IN HAND SALARY");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }

    private static void calculateTaxesAndSalaryInHand() {
        for (int i = 1; i <= 23; i++) {
            int days = i;
            int totalBillToClient = days * WORK_HOURS_PER_DAY * HOURLY_RATE;
            double gstAmount = totalBillToClient * GST_PERCENTAGE / (100 + GST_PERCENTAGE);
            int tenPercentFlatTax = totalBillToClient / 10;
            double inHandSalary = totalBillToClient - (gstAmount + tenPercentFlatTax);
            printResult(days, totalBillToClient, tenPercentFlatTax, gstAmount, (gstAmount + tenPercentFlatTax), inHandSalary);
        }
    }

    private static void printResult(int days, int totalBillToClient, int tenPercentFlatTax, double gstAmount, double totalTax, double inHandSalary) {
        String formattedTotalBillToClient = formatIndianNumber(totalBillToClient);
        String formattedTenPercentFlatTax = formatIndianNumber(tenPercentFlatTax);
        String formattedGstAmount = formatIndianNumber(gstAmount);
        String formattedTotalTax = formatIndianNumber(totalTax);
        String formattedInHandSalary = formatIndianNumber(inHandSalary);

        System.out.printf("| %-10s | %-18s | %-16s | %-19s | %-10s | %-15s |%n", days, formattedTotalBillToClient, formattedTenPercentFlatTax, formattedGstAmount, formattedTotalTax, formattedInHandSalary);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }

    private static String formatIndianNumber(double value) {
        Format format = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        return format.format(value);
    }
}
