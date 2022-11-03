class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int flipT=createConfusion(answerKey,'T',k);
        int flipF=createConfusion(answerKey,'F',k);
        return Math.max(flipT,flipF);
    }
    public static int createConfusion(String str,char ch,int k){
        int si=0,ei=0,ans=0,flip=0;
        while(ei<str.length())
        {
            if(str.charAt(ei)==ch)
                flip++;
            while(flip>k){
                if(str.charAt(si)==ch)
                    flip--;
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}