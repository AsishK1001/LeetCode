// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.

// Visit : https://leetcode.com/problems/reverse-string/description/

class Solution {
    public void reverseString(char[] s) {
        char temp;
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
    }
}
