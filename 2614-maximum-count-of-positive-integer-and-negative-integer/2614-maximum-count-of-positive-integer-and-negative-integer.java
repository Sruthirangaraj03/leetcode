class Solution {
    public int maximumCount(int[] nums) {
    int n=0,p=0,z=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]<0) n++;
        else if(nums[i]==0) z++;
        else p++;
    } 
    if(p>=n) return p;
    else return n;
    }
}