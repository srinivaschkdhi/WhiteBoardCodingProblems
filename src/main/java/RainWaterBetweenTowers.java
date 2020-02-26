import java.util.Arrays;

/**
 * @author Srinivas_Chintakindhi
 */

public class RainWaterBetweenTowers {

    public static int getMaxRainWaterBetweenTowers(int[] towerHeights) {
        int maxSeenSoFar = 0;

        int[] maxSeenRight = new int[towerHeights.length];
        int maxSeenLeft = 0;

        int rainwater = 0;

        for (int i = towerHeights.length - 1; i >= 0; i--) {

            if (towerHeights[i] > maxSeenSoFar) {
                maxSeenSoFar = towerHeights[i];

                maxSeenRight[i] = maxSeenSoFar;
            }
        }

        System.out.println(Arrays.toString(maxSeenRight));

        return 0;
    }

    public static void main(String[] args) {
        getMaxRainWaterBetweenTowers(new int[]{1,5,2,3,1,7,2});
    }
}
