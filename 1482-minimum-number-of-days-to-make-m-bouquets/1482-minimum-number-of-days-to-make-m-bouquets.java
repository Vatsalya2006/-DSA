class Solution {
    public static boolean isPossible(int[]bloomDay, int day, int m, int k){
        int count=0, bouquets=0;
        for(int bloom: bloomDay)
        {
         if(bloom<=day)
         {
              count++;
              if(count==k)
               {
                  bouquets++;
                 count=0;
                } 
         }
            else{
                count=0;
            }
        }
        return bouquets >=m;
    }
    public int minDays(int[]bloomDay, int m, int k)
     {
        int n= bloomDay.length;
        long req=(long)m*k;
        if(n<req)
        {
            return -1;
        }
        int minValue= Integer.MAX_VALUE;
        int maxValue= Integer.MIN_VALUE;

        for(int bloom : bloomDay)
        {
            minValue=Math.min(minValue,bloom);
            maxValue=Math.max(maxValue,bloom);
        }
        int low=minValue;
        int high=maxValue;
        while(low<=high)
        {

            int mid=(low+high)/2;
            if (isPossible(bloomDay, mid, m, k))
            {
                high=mid-1;

            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}