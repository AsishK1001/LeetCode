/* You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day.
The record only contains the following three characters:
  'A': Absent.
  'L': Late.
  'P': Present.
The student is eligible for an attendance award if they meet both of the following criteria:
  The student was absent ('A') for strictly fewer than 2 days total.
  The student was never late ('L') for 3 or more consecutive days.
Return true if the student is eligible for an attendance award, or false otherwise. */

// Visit : https://leetcode.com/problems/student-attendance-record-i/description/

class Solution {
    public boolean checkRecord(String s) {
        if(s.indexOf("LLL")!=-1) return false;
        int a=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='A') a++;
            if(a>=2) return false;
        }
        return true;
    }
}
