class Solution {
    public int findPeakElement(int[] nums) {
    int max=nums[0],a=0;
    for(int i=1;i<nums.length;i++){
        if(max<nums[i]){
        max=nums[i];
        a=i;}
    }
    return a;
    }
}