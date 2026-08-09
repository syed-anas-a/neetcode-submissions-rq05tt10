class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int x : piles) {
            max = Math.max(x, max);
        }
        int k = max, min = 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            long currentH = 0;
            for (int x : piles) {
                currentH += (x + mid - 1) / mid;
            }
            if (currentH <= h) {
                k = Math.min(k, mid);
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return k;
    }
}