class Solution {
    public boolean isPalindrome(int x) {
            int result = 0;
            int num = x;
            if(num < 0){
                return false;
            }
            while(num!=0){
                int rem = num % 10;
                result = result * 10 + rem;
                num = num / 10;
            }
            if(x == result){
                return true;
            }
            return false;
        }
    }
