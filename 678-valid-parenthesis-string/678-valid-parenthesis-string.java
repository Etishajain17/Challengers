class Solution {
    public boolean checkValidString(String s) {
        int l=0,h=0;
        for(char ele : s.toCharArray())
        {
            if(ele=='(')
                l++;
            else
                l--;
            if(ele!=')')
                h++;
            else
                h--;
            if(h<0)
                break;
            l=Math.max(l,0);
        }
        return (l==0);
    }
}