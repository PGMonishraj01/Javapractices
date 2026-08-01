class Solution {
    public String longestPalindrome(String s) {
        boolean flag = true;

int l = 0;
int r = a.length() - 1;

while (l < r) {
    if (a.charAt(l) != a.charAt(r)) {
        flag = false;
        break;
    }
    l++;
    r--;
}

if (flag && a.length() > ans.length()) {
    ans = a;
}
    }
}
