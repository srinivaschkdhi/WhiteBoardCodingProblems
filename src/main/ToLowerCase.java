public class ToLowerCase {
    public static String toLowerCase(String str) {
        String result = "";

        for (char ch :
                str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "SRINIvas";
        System.out.println(toLowerCase(str));
    }
}
