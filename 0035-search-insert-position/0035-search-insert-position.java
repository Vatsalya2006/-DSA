class Solution {
    public int searchInsert(int[] nums, int target) {
        int place=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target)
            {
                place=i;
                return place;
            }
    
              else if(nums[0]>target)
            {
             place=0;
             return place;
         }
        }


        return nums.length;
    }
}