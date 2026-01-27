class Solution {
    public int search(int[] nums, int target) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            {
                 j=i;
                 return j;
            }
            else{
                continue;
        }
        }
        return -1;   
    }
}