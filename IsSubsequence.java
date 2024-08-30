// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

// Visit : https://leetcode.com/problems/is-subsequence/description/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int j=0;
        for(int i=0;i<t.length();i++) {
            if(j==s.length()-1 && s.charAt(j)==t.charAt(i)) return true;
            if(s.charAt(j)==t.charAt(i)) j++;
        }
        return false;
    }
}
