import java.util.Comparator;
import java.util.PriorityQueue;

public class RearrangeChars {
    public static void rearrange(String input) {
        int n = input.length();
        int[] count = new int[26];

        for (char c : input.toCharArray())
            count[c - 'a']++;

        PriorityQueue<Key> priorityQueue = new PriorityQueue<>(Comparator.comparing(Key::getFreq).reversed());

        for (char c = 'a'; c <= 'z'; c++) {
            int index = c - 'a';

            if (count[index] > 0)
                priorityQueue.add(new Key(c, count[index]));
        }

        String result = "";
        Key prev = new Key('#', -1);

        while (!priorityQueue.isEmpty()) {
            Key k = priorityQueue.poll();
            result += k.getC();
            k.freq--;

            if (prev.freq > 0)
                priorityQueue.add(prev);

            prev = k;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "bbbaccccca";
        rearrange(str);
    }
}

class Key {
    char c;
    int freq;

    public Key(char c, int freq) {
        this.c = c;
        this.freq = freq;
    }

    public char getC() {
        return c;
    }

    public int getFreq() {
        return freq;
    }
}
