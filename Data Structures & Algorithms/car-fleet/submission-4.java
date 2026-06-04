class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleet = 0;
        double maxEtaSeen = 0;
        int n = position.length;
        int[][] cars = new int[n][2];

        for(int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);
        for(int[] car: cars) {
            double eta = (double) (target - car[0]) / car[1];
            if(eta > maxEtaSeen) {
                fleet++;
                maxEtaSeen = eta;
            }
        }
        return fleet;
    }
}
