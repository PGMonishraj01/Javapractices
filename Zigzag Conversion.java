class Solution {
    public String convert(String s, int row) {
        StringBuilder sb = new StringBuilder();
        int ind  = 0;
        int n = s.length();
        int a[] = new int[n];
        while( ind < n)
        {
            for( int i = 1 ;i <= row && ind < n ;i++){
                a[ind++] = i;
            }
            for(int i = row - 1; i >= 2 && ind < n ;i--){
                a[ind++] = i;
            }
        }
        for(int i = 1 ;i <= row ;i++)
        {
            for(int j = 0 ;j < n ;j++)
            {
                if(i == a[j])
                {
                    sb.append(s.charAt(j));
                }
            }
        }
        return sb.toString();
    }
}
