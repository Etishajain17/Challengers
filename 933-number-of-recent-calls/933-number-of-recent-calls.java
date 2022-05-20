class RecentCounter {
    LinkedList<Integer> arr;
    public RecentCounter() {
        arr=new LinkedList<>();
    }
    
    public int ping(int t) {
        arr.addLast(t);
        while(arr.getFirst()<t-3000)
            arr.removeFirst();
        return arr.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */