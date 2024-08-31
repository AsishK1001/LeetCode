// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// Visit : https://leetcode.com/problems/reverse-integer/description/

class Solution {
    public int reverse(int x) {
        int c=1;
        long rev=0;
        if(x<0) {
            c=-1;
            x*=c;
        }
        while(x!=0) {
            rev=rev*10+(x%10);
            x/=10;
        }
        if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE) return 0;
        return (int)rev*c;
    }
}
