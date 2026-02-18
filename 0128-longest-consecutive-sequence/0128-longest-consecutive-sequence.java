class Solution {
    public int longestConsecutive(int[] nums) {
        int l=nums.length;
        if(l==0)
        return 0;
         Arrays.sort(nums);
        int count=1;
        int maxcount=1;
        for(int i=0;i<l-1;i++){
             int n=nums[i+1]-nums[i];
            if(n==1){
                count+=1;
            }
            else if(n==0){
                continue;
            }
            else{
            count=1;
        }
        maxcount=Math.max(maxcount,count);
        }

        return maxcount;
    }
}