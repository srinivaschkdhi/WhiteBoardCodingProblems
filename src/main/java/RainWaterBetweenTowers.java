import java.util.Arrays;

/**
 * @author Srinivas_Chintakindhi
 */

public class RainWaterBetweenTowers {

    public static int getMaxRainWaterBetweenTowers(int[] towerHeights) {
        int n = height.length;
        int[] maxSeenRights = new int[n];
        int maxSeenSoFar = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (height[i] > maxSeenSoFar)
                maxSeenSoFar = height[i];

            maxSeenRights[i] = maxSeenSoFar;
        }

        int maxSeenLeft = 0;
        int rainWater = 0;

        for (int i = 0; i < n; i++) {
            if (height[i] > maxSeenLeft)
                maxSeenLeft = height[i];

            rainWater +=
                    Math.max(Math.min(maxSeenLeft, maxSeenRights[i]) - height[i], 0);
        }

        return rainWater;
    }

    public static void main(String[] args) {
        getMaxRainWaterBetweenTowers(new int[]{1,5,2,3,1,7,2});
    }
}
