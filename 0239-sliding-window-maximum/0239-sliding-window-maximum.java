class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int[] arr=new int[nums.length-k+1];
        // ArrayList<Integer> win=new ArrayList<Integer>();
        // for(int i=0;i<k;i++)
        //     win.add(nums[i]);
        // int i=0;
        // for(;i<nums.length-k;i++){
        //     arr[i]=Collections.max(win);
        //     win.remove(0);
        //     win.add(nums[i+k]);
        // }
        // arr[i]=Collections.max(win);
        // return arr;     //n*k
        return maxSlidingWindow1(nums,k);
    }
    public static int[] maxSlidingWindow1(int[] arr,int k){
        Deque<Integer> dq=new LinkedList<Integer>();
        int[] ans=new int[arr.length-k+1];
        int j=1;
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
                dq.removeLast();
            }
            dq.add(i);
        }
        ans[0]=arr[dq.getFirst()];
        for (int i = k; i < arr.length; i++) {
            while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
                dq.removeLast();
            }
            dq.add(i);
            if (!dq.isEmpty() && dq.getFirst() == i - k) {
                dq.removeFirst();
            }
            ans[j] = arr[dq.getFirst()];
            j++;
        }
        return ans;
    }
}