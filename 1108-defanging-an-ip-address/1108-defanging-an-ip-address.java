class Solution {
    public String defangIPaddr(String address) {
        for(int i=0;i<address.length()-2;i++)
        {
            if(address.charAt(i+1)=='.')
            {
                address=address.substring(0,i+1)+"[.]"+address.substring(i+2);
                i=i+2;
            }
        }
        return address;
    }
}