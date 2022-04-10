class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s=new Stack<>();
        int sum=0;
        for(String op : ops)
        {
            if(op.equals("+"))
            {
              int t1=s.pop();
              int t2=s.peek()+t1;
              s.push(t1);
              s.push(t2);  
            }
            else if(op.equals("C"))
                s.pop();
            else if(op.equals("D"))
                s.push(s.peek()*2);
            else
                s.push(Integer.valueOf(op));
        }
        for(int x: s)
        {
            sum+=x;
        }
        return sum;
    }
}