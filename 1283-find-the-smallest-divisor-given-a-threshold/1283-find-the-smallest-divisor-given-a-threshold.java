class Solution { 
    public int sumAfterDivision(int []nums, int divisor){
        int sum=0;
        for(int number: nums)
        {
            int s=(int)Math.ceil((double)number/divisor);
            sum+=s;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxValue=Integer.MIN_VALUE;
        for(int number: nums){
            maxValue=Math.max(maxValue, number);
        }
        int low=1;
        int high=maxValue;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=sumAfterDivision(nums, mid);
            if(sum>threshold){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;

        
    }
   
}