class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue < Integer > pq = new PriorityQueue < Integer > (Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) 
            pq.add(nums[i]);
        int l = k - 1;
        while (l > 0) {
            pq.poll();
            l = l - 1;
        }
        return pq.peek();
    }
}