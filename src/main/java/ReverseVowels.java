import java.util.HashSet;

class ReverseVowels {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;

        HashSet<Character> vowels = new HashSet<Character>() {{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
            add('A');
            add('E');
            add('I');
            add('O');
            add('U');
        }};

        char[] A = s.toCharArray();

        while (left < right) {

            while (left < right && !vowels.contains(A[left]))
                left++;

            while (left < right && !vowels.contains(A[right]))
                right--;

            if (left < right) {
                char temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }

        return new String(A);
    }
}
