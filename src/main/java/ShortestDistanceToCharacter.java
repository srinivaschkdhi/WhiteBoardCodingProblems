public class ShortestDistanceToCharacter {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] outputArr = new int[n];
        int cPosition = -n;

        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == C) {
                cPosition = i;
            } else {
                outputArr[i] = i - cPosition;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                cPosition = i;
            } else {
                outputArr[i] = Math.min(outputArr[i], Math.abs(i - cPosition));
            }
        }

        return outputArr;
    }

}
