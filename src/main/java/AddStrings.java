public class AddStrings {
    public String addStrings(String num1, String num2) {
            StringBuilder result = new StringBuilder();

            int i = num1.length() - 1;
            int j = num2.length() - 1;

            int sum = 0;
            int carry = 0;

            while (i >= 0 || j >= 0) {
                int x = (i >= 0) ? num1.charAt(i) - '0' : 0;
                int y = (j >= 0) ? num2.charAt(j) - '0' : 0;
                sum = carry + x + y;

                result.append(sum % 10);
                carry = sum / 10;

                i--;
                j--;
            }

            if (carry != 0)
                result.append(carry);

            return result.reverse().toString();
    }
}
