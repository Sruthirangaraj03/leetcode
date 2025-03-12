class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum=0, max=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(max<nums[i]) max=nums[i];
    }
    for(int i=0;i<k;i++){
        sum=sum+max;
        max=max+1;
    }
    return sum; 
    }
}