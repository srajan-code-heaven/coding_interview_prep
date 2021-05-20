
// Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.



class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
       StringBuilder ans=new StringBuilder();
       for(int i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           if(c>='a' && c<='z')
           {
               ans=ans.append((char)(((c+k)-'a')%26+'a'));
           }
           else if(c>='A' && c<='Z')
           {
               ans=ans.append((char)(((c+k)-'A')%26+'A'));
           }
           else
           {
               ans=ans.append(c);
           }
       }
       return ans.toString();

    }

}
