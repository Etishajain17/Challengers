class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int top=0,bottom=arr.length;
        int left=0,right=arr[0].length;
        List<Integer> ls=new ArrayList<Integer>();
        while(left<right && top<bottom)
        {
            for(int i=left;i<right;i++)
                ls.add(arr[top][i]);
            top++;
            for(int i=top;i<bottom;i++)
                ls.add(arr[i][right-1]);
            right--;
            if(left>=right || top>=bottom)
                break;
            for(int i=right-1;i>=left;i--)
                ls.add(arr[bottom-1][i]);
            bottom--;
            for(int i=bottom-1;i>=top;i--)
                ls.add(arr[i][left]);
            left++;
        }
        return ls;
    }
}