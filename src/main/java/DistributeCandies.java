
public class DistributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];

        int i = 0;
        int loops = 0;

        while (candies > 0) {
            if (i == num_people) {
                loops++;
                i = 0;
            }

            int curr_candy = (loops * num_people) + (i + 1);

            result[i] += Math.min(candies, curr_candy);

            i++;

            candies = candies - curr_candy;
        }

        return result;
    }

    public int[] districuteCandies2(int candies, int num_people) {
        int[] res = new int[num_people];
        for (int i = 0; candies > 0; i++) {
            res[i % num_people] += Math.min(candies, i + 1);
            candies -= i + 1;
        }
        return res;
    }
}
