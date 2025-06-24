class Solution {
    public String gcdOfStrings(String str1, String str2) {
    int slice=0;
    if ((str1+str2).equals(str2+str1)){
        slice=compute(str1.length(),str2.length());
        return str1.substring(0,slice);
    }
     return "";
    }
    private int compute(int a, int b){
        if(b==0) return a;
        return compute(b, a % b);
    }
     
}