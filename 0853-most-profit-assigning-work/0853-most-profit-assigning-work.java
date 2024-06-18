class Solution {
    public int maxProfitAssignment(int[] d, int[] p, int[] w) {
        int n = d.length;
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = d[i];
            jobs[i][1] = p[i];
        }
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        Arrays.sort(w);

        int sum = 0;
        int maxProfit = 0;
        int j = 0;

        for (int worker : w) {
            while (j < n && worker >= jobs[j][0]) {
                maxProfit = Math.max(maxProfit, jobs[j][1]);
                j++;
            }
            sum += maxProfit;
        }

        return sum;
    }
}
