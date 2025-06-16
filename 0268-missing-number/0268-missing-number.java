class Solution {
    public int missingNumber(int[] nums) {
    int l=0,r=1;
    Arrays.sort(nums);
    if(nums[l]==1) return 0;
    while(r<nums.length){
        if(nums[r]==nums[l]+1){
            l++;
            r++;
        }else{
            return nums[r]-1;
        }
    }
    return nums.length;  
    }
}