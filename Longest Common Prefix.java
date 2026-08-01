class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String  a=strs[0];
        String nsa="";
        String b=strs[strs.length-1];
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                nsa=nsa+a.charAt(i);
            }
            else break;
        }
        return nsa;
    }
}
