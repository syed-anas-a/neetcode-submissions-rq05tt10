class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for(int x: piles) {
            maxPile = Math.max(x, maxPile);
        }
        int left = 1, right = maxPile;
        int k = maxPile;
        while(left <= right) {
            int mid = left + (right-left) / 2;
            boolean validK = false;
            long currentH = 0;
            for(int x: piles) {
                currentH += (x+mid-1) / mid;
            }
            if(currentH <= h) {
                k = Math.min(k, mid);
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return k;
    }
}
