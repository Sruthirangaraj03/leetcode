class Solution {
    public boolean isPalindrome(int x) {
    int r=0,s=0,l=0,num=x;
    if(x<0){
        return false;
    }
    while(x!=0){
        x=x/10;
        l++;
    }
    x=num;
    l=l-1;
    while(x!=0){
        r=x%10;
        x=x/10;
        s=s + r* (int)Math.pow(10,l);
        l--;
    }
    x=num;
    if(x==s){
        return true;
    }
    return false;
    }
}