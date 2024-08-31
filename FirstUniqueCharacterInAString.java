// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Visit : https://leetcode.com/problems/first-unique-character-in-a-string/description/

class Solution {
    public int firstUniqChar(String s) {
        int k;
        for(int i=0;i<s.length();i++) {
            k=0;
            for(int j=0;j<s.length();j++) {
                if(i==j) continue;
                if(s.charAt(i)==s.charAt(j)) {
                    k++; break;
                }
            }
            if(k==0) return i;
        }
        return -1;
    }
}
// asdfghjk
