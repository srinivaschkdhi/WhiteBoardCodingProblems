public class  ValidParenthesisString {
    public boolean checkValidString(String s) {
            if (s == null || s.length() == 0)
                return true;

            int numCharsLeftToUse = 0;
// As I coming from left . I should have either '(' or '*' on left side of ')' to balance ')' which means numChars should be > 0
            for (int i = 0; i < s.length(); i++) { // balancing close parenthesis
                if (s.charAt(i) == ')') {
                    if (numCharsLeftToUse == 0) // if i don't have either '(' or '*' on left . i cannot balance ')'
                        return false;
                    numCharsLeftToUse--;
                } else
                    numCharsLeftToUse++;
            }

            if (numCharsLeftToUse == 0)
                return true;

            numCharsLeftToUse = 0;

            for (int i = s.length() - 1; i >= 0; i--) { // balancing open parenthesis
                if (s.charAt(i) == '(') {
                    if (numCharsLeftToUse == 0)
                        return false;
                    numCharsLeftToUse--;
                } else
                    numCharsLeftToUse++;
            }
            return true;
    }
}
