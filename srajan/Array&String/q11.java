class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();

        if(n<=1)
        {
            return true;
        }

        int i=0;
        int j=n-1;

        while(i<=j)
        {

            while(i<n && !isValidAlphaNumeric(s.charAt(i)))
            {
                i++;
            }
            if(i==n)
            {
                break;
            }
            while( j>=0 && !isValidAlphaNumeric(s.charAt(j)))
            {
                j--;
            }
             if(j==0)
            {
                break;
            }
            char c1=s.charAt(i);
            char c2=s.charAt(j);

            if(Character.toUpperCase(c1)==Character.toUpperCase(c2))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

     public  boolean isValidAlphaNumeric(char c){
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >='0' && c<='9'));
    }
}
