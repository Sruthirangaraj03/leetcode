class Solution {
    public void moveZeroes(int[] nums) {
    int l=0,r=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r++;
        }else{
            r++;
        }
    }   
    }
}