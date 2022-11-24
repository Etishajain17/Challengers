class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i]*2) && hs.get(arr[i]*2)!=i)
                return true;
        }
        return false;
    }
}