public class LexicographicalMaximumsubstring {
    public String lexMaxSubStr(String str) {
        String maxStr = "";

        for (int i = 0; i < str.length(); i++) {

            if (maxStr.compareTo(str.substring(i)) <= 0) {
                maxStr = str.substring(i);
            }
        }

        return maxStr;
    }

    public static void main(String[] args) {
        String lexMaxSubStr = new LexicographicalMaximumsubstring().lexMaxSubStr("banana");
        System.out.println("lexMaxSubStr = " + lexMaxSubStr);
    }

}
