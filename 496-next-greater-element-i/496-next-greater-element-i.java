class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(nums2[nums2.length-1]);
        for(int j=0;j<nums1.length;j++)
            {
                if(nums2[nums2.length-1]==nums1[j])
                {
                    nums1[j]=-1;
                    break;
                }
            }
        for(int i=nums2.length-2;i>=0;i--)
        {
            while(stack.isEmpty()==false && stack.peek()<=nums2[i])
                stack.pop();
            int nextGreater=(stack.isEmpty())?(-1): (stack.peek());
            for(int j=0;j<nums1.length;j++)
            {
                if(nums2[i]==nums1[j])
                {
                    nums1[j]=nextGreater;
                    break;
                }
            }
            
            stack.push(nums2[i]);
        }
        
        return nums1;
    }
}