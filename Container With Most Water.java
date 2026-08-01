class Solution {
    public int maxArea(int[] h) {
        int left=0;
        int right =h.length-1;
        int maxArea=0;
        while(left < right){
            int width = right - left;
            int area = width * Math.min(h[left],h[right]);
            maxArea=Math.max(area,maxArea);
            if(h[left]>h[right])right -- ;
            else left ++ ;
        }
        return maxArea;
    }
}
