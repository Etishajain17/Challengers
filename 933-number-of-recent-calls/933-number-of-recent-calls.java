class RecentCounter {
    ArrayList<Integer> arr;
    public RecentCounter() {
        arr=new ArrayList<>();
    }
    
    public int ping(int t) {
        arr.add(t);
        int c=0;
        for(Integer i:arr)
        {
            if(i<t-3000 || i>t)
                c++;
        }
        return arr.size()-c;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */