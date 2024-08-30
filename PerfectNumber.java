/* A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false. */

// Visit : https://leetcode.com/problems/perfect-number/description/

class Solution {
    public boolean checkPerfectNumber(int num) {
        int res=0;
        for(int i=1;i<=num/2;i++)
            if(num%i==0)
                res+=i;
        return res==num;
    }
}
