class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int divisor = 1;
        while(x / divisor >= 10) {
            divisor *= 10;
        }
        return checkPal(x, divisor);
    }
    boolean checkPal(int x, int divisor) {
        if(x == 0 || divisor < 10) return true;
        int first = x / divisor;
        int last = x % 10;
        if(first != last) return false;
        return checkPal((x % divisor) / 10, divisor / 100); 
    }
}