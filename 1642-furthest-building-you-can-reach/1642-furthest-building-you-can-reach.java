class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> jumpsTaken = new PriorityQueue<Integer>((a, b) -> (b - a));
        
        for(int i = 0; i < heights.length - 1; i++){
            int jump = heights[i + 1] - heights[i];
            if(jump > 0){
                jumpsTaken.add(jump);
                bricks -= jump;
                if(bricks < 0){ 
                    if(ladders <= 0) return i;
                    ladders--;
                    int lastMaxJump = jumpsTaken.remove();
                    bricks += lastMaxJump;
                }
            }
        }
        return heights.length - 1;
    }
}