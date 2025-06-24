class Solution {
    public String gcdOfStrings(String str1, String str2) {
    StringBuilder a = new StringBuilder();
    int slice=0;
    if ((str1+str2).equals(str2+str1)){
        slice=compute(str1.length(),str2.length());
        for(int i=0;i<slice;i++){
           a.append(str1.charAt(i));
        }
        return a.toString();
    }
     return "";
    }
    private int compute(int a, int b){
        if(b==0) return a;
        return compute(b, a % b);
    }
     
}