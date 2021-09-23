import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTownJudge {
    public int findJudge(int N, int[][] trust) {
        if (trust.length == 1)
            return trust[0][1];

        Set<Integer> set = new HashSet<>();
        List<Integer> firsts = new ArrayList<>();

        for (int i = 0; i < trust.length; i++) {
            set.add(trust[i][0]);
        }

        for (int i = 1; i <= N; i++) {
            if (!set.contains(i))
                firsts.add(i);
        }

        for (Integer first : firsts) {
            int count = 0;
            for (int i = 0; i < trust.length; i++) {
                if (first == trust[i][1])
                    count++;
            }
            if (count == N - 1)
                return first;
        }
        return -1;
    }

    //calculate trusts for N people in array. if guy occurs in first place trust decrease by 1, if occurs in second place increases by 1.
    public int findJudge2(int N, int[][] trust) {
        if(N == 1 && trust.length == 0)
            return 1;

        if (trust.length == 1)
            return trust[0][1];

        int[] count = new int[N + 1];

        for (int[] t : trust) {
            count[t[0]]--;
            count[t[1]]++;
        }

        for(int i = 0; i < count.length;i++){
            if(count[i] == N - 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int judge = new FindTownJudge().findJudge(3, new int[][]{{1, 3}, {2, 3}});
        System.out.println(judge);
    }
}
