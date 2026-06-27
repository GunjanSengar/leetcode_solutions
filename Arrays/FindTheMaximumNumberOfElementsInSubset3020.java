class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Long, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        // Special case for 1
        if (map.containsKey(1L)) {
            int count = map.get(1L);
            ans = Math.max(ans, (count % 2 == 0) ? count - 1 : count);
        }

        for (long x : map.keySet()) {

            if (x == 1) continue;

            int len = 0;
            long cur = x;

            while (map.getOrDefault(cur, 0) >= 2) {
                len += 2;

                if (cur > 1000000000L / cur)
                    break;

                cur = cur * cur;
            }

            if (map.getOrDefault(cur, 0) >= 1)
                len++;

            ans = Math.max(ans, len);
        }

        return ans;
    }
}