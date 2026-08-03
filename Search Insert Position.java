class Solution {
    public int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);
        if(target>nums[nums.length-1])return nums.length;
        // if(target< nums[0])return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
            else{
                if(nums[i]>target)return i;
                // else return 0;
        }

        }
        return 0;
    }
}
