class Solution {
    public double average(int[] salary) {
        int min=salary[0],max=salary[0],sum=salary[0];
        for(int i=1;i<salary.length;i++){
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
            sum+=salary[i];
        }
        sum-=min+max;
        return (sum*1.0)/(salary.length-2);
    }
}