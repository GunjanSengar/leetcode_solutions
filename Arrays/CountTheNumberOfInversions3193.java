import java.util.*;

class Solution {

    public int numberOfPermutations(int n, int[][] requirements) {

        int MOD = 1_000_000_007;

        int[] req = new int[n];
        Arrays.fill(req, -1);

        int maxInv = 0;

        for (int[] r : requirements) {
            req[r[0]] = r[1];
            maxInv = Math.max(maxInv, r[1]);
        }

        if (req[0] > 0) return 0;

        req[0] = 0;

        int[][] dp = new int[n][maxInv + 1];

        dp[0][0] = 1;

        for (int i = 1; i < n; i++) {

            int left = 0;
            int right = maxInv;

            if (req[i] != -1) {
                left = right = req[i];
            }

            for (int j = left; j <= right; j++) {

                for (int k = 0; k <= Math.min(i, j); k++) {

                    dp[i][j] =
                        (dp[i][j] + dp[i - 1][j - k]) % MOD;
                }
            }
        }

        return dp[n - 1][req[n - 1]];
    }
}