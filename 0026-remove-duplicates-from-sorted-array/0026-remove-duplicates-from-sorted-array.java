class Solution {
    public int removeDuplicates(int[] nums) {
    int m=1,l=0,r=1,c=1;
    while(r<nums.length){
        if(nums[l]!=nums[r]){
            c++;
            nums[m]=nums[r];
            m++;
        }
        l++;
        r++;
    }
    return c;
    }
}