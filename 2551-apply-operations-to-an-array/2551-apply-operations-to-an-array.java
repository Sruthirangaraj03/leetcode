class Solution {
    public int[] applyOperations(int[] nums) {
    int l=0,r=1,i=0;
    while(r<nums.length){
        if(nums[l]==nums[r]){
            nums[l]=nums[l]*2;
            nums[r]=0;
        }
        l++;
        r++;
    }
    l=0;
    while(l<nums.length){
        if(nums[l]!=0){
            nums[i++]=nums[l];
        }
        l++;
    }
    while(i<nums.length){
        nums[i++]=0;
    }
    return nums;
    }
}