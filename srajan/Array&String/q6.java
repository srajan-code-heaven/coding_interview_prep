// 392. Is Subsequence
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).


class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1=s.length();
        if(l1==0 )
        {
            return true;
        }
        int j=0;
        int l2=t.length();
        // if(l1>l2)
        // {
        //     return false;
        // }
        for(int i=0;i<l2 && j<l1 ;i++)
        {
           if(s.charAt(j)==t.charAt(i))
           {
               j++;
           }
        }
        if(j==l1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
