class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue=new LinkedList<>();
        Arrays.sort(deck);
        for(int i=deck.length-1;i>=0;i--)
        {
            if(!queue.isEmpty())
            {
                queue.add(queue.remove());
                queue.add(deck[i]);
            }
            else
                queue.add(deck[i]);
        }
        int i=deck.length;
        while(i-->0)
            deck[i]=queue.remove();
        return deck;
    }
}