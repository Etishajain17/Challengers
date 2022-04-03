class Solution {
    public void nextPermutation(int[] n) {
        int i = n.length - 2;
        while (i >= 0 && n[i + 1] <= n[i]) 
            i--;
        
        if (i >= 0) {
            int j = n.length - 1;
            while (n[j] <= n[i]) 
                j--;
            swap(n, i, j);
        }
        reverse(n, i + 1);
    }

    void swap(int[] n, int i, int j) {
        int t = n[i];
        n[i] = n[j];
        n[j] = t;
    }
    
    void reverse(int[] n, int x) {
        int i = x, j = n.length - 1;
        while (i < j) {
            swap(n, i, j);
            i++;
            j--;
        }
    }
}