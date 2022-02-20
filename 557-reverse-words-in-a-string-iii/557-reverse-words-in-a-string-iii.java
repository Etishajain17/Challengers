class Solution {
    public String reverseWords(String s) 
    {
        String[] ar=s.split(" ");
        String st="";
        for(int i=0;i<ar.length;i++)
        {
            int l=0,h=ar[i].length()-1;
            if(l<h)
            ar[i]=ar[i].charAt(h)+ar[i].substring(l+1,h)+ar[i].charAt(l);
            while(++l<--h)
                ar[i]=ar[i].substring(0,l)+ar[i].charAt(h)+ar[i].substring(l+1,h)+ ar[i].charAt(l)+ar[i].substring(h+1);
            st=st+ar[i]+" ";
        }
        
        return st.substring(0,st.length()-1);
    }
}