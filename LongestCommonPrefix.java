/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "". */

// Visit : https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder("");
        for(int j=0;j<strs[0].length();j++) {
            for(int i=0;i<strs.length;i++) {
                if(j>=strs[i].length()) return new String(ans);
                if(strs[i].charAt(j)!=strs[0].charAt(j)) 
                    return new String(ans);
            }
            ans.append(strs[0].charAt(j));
        }
        return new String(ans);
    }
}
