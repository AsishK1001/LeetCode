/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:
  Whitespace: Ignore any leading whitespace (" ").
  Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
  Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
  Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.

Return the integer as the final result.
*/

// Visit : https://leetcode.com/problems/string-to-integer-atoi/description/

class Solution {
    public int myAtoi(String s) {
        long num=0;
        int t,c=1,i;
        if(s.length()==0) return 0;
        for(i=0;i<s.length();i++)
            if(s.charAt(i)!=' ') break;
        if(i==s.length()) return 0;
        if(s.charAt(i)=='-') {c=-1; i++; }
        else if(s.charAt(i)=='+') i++;
        for(i=i;i<s.length();i++) {
            if(s.charAt(i)<48 || s.charAt(i)>57) break;
            num=num*10+(s.charAt(i)-48);
            if((c==-1) && num*c<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(c==1 && num>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        num*=c;
        return (int)num;
    }
}
