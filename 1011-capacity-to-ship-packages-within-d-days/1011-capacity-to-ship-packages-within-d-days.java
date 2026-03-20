class Solution {
    public int numberOfDays( int[] weights, int mid)
    {
        int days=1, sum=0;
        for(int i=0; i<weights.length; i++)
        {
            if(sum+weights[i]<=mid)
            {
                sum+=weights[i];
            }
            else
            {
                sum=weights[i];
                days++;
            }
        }
         return days;
    }
    public int shipWithinDays(int[] weights, int days)
     {
        int maxValue = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            maxValue=Math.max(maxValue,weights[i]);
            sum+=weights[i];
        }
        int low=maxValue;
        int high=sum;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int loadDays= numberOfDays(weights,mid);
            if(loadDays>days)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;   
    }
}