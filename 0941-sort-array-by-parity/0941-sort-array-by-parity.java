class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int l=0,r=nums.length-1;
       while(l<=r){
        if(nums[r]%2==0 && nums[l]%2!=0){
           int a=nums[r];
           nums[r]=nums[l];
           nums[l]=a;
        }else if(nums[r]%2==0 && nums[l]%2==0){
            l++;
        }else{
            r--;
        }
       }
       return nums; 
    }
}