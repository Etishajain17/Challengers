class Solution {
    public boolean validPalindrome(String s) {
        return occur(s, 0, s.length()-1, 1);
    }
    
    public boolean occur(String s, int start, int end, int count) {
        if(count == -1)
            return false;
        int low = start;
        int high = end;
        while(low < high) {
            if(s.charAt(low) != s.charAt(high)) 
                return occur(s, low+1, high, count-1) || occur(s, low, high-1, count-1); 
            low++;
            high--;
        }
        
        return true;
    }
}