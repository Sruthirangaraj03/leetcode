class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,s=0;
        int a= n*(n+1)/2;
        for(int i=0;i<n;i++){
            s += nums[i];
        }
    return a-s;
    }
}