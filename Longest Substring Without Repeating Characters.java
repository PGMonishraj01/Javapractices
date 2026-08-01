class Solution {
    public int lengthOfLongestSubstring(String s) {
       int  n = s.length();
       int left = 0;
       int right = 0;
       int max = 0;
       HashMap<Character,Integer> map= new HashMap<>();
       while(right < n)
       {
        while(map.containsKey(s.charAt(right)) ){
            map.remove(s.charAt(left));
            left ++;

        }
        map.put(s.charAt(right),1);
       max=Math.max(max,right-left+1);

        right++;
        
       }return max;
    }
}
