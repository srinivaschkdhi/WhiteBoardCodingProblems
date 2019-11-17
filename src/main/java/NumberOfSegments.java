
public class NumberOfSegments {
    public int countSegments(String s) {
        int segments = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                segments += 1;
            }
        }
        return segments;
    }
}
// if curr char is not space and if it is first char
// if curr char is not space and last char is space
