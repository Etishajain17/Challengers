class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        for(int i=0;i<image.length;i++)
        {
            int low=0;
            int high=image[i].length-1;
            while(low<high)
            {
                int temp=image[i][low];
                image[i][low]=image[i][high];
                image[i][high]=temp;
                if(image[i][low]==0)
                    image[i][low]=1;
                else
                    image[i][low]=0;
                if(image[i][high]==0)
                    image[i][high]=1;
                else
                    image[i][high]=0;
                low++;
                high--;
            }
            if(image[i].length%2!=0)
            {
                if(image[i][low]==0)
                   image[i][low]=1;
                else
                   image[i][low]=0;
            }
        }
        return image;
    }
}