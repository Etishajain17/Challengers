class Solution {
    public int maxScore(int[] cp, int k) {
    int n = cp.length;
    int leftsum = 0;
    for (int i = 0; i < k; i++) {
        leftsum += cp[i];
    }
    int max = leftsum;
    int rightsum = 0;

    for (int i = 0; i < k; i++) {
        leftsum  -= cp[k - 1 - i];
        rightsum += cp[n - 1 - i];
        max = Math.max(max, leftsum + rightsum);
    }

    return max;
    }
}