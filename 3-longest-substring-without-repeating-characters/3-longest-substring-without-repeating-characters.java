class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0,right = 0,ans = 0;
        int[] chars = new int[128];
        while(right < s.length()){
            char c = s.charAt(right);
            if(chars[c] > 0) {
                left = Math.max(left, chars[c]);
            }
            ans = Math.max(ans, right - left + 1);
            chars[c] = ++right;
        }
        return ans;
    }
}