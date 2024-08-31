//Given an integer x, return true if x is a palindrome, and false otherwise.

//Visit : https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,temp=x;
        if(x<0) return false;
        while(x!=0) {
            rev=rev*10+(x%10);
            x=x/10;
        }
        if ( rev == temp )
            return true;
        else
            return false;
    }
}
// @Zayn
