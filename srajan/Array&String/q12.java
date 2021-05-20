//443. String Compression

class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
            int tmp=chars[i];
            int cnt=1;
            chars[s]=chars[i];
            s++;
            while(i+1<n  && chars[i]==chars[i+1])
            {
                cnt++;
                i++;
            }
            if(s<n)
            {
                if(cnt>1)
                {
                    if(cnt>=10)
                    {
                        int cnt1=cnt/10;
                        chars[s]=(char)(cnt1+'0');
                        s++;
                        chars[s]=(char)(cnt%10+'0');
                    }
                    else
                    {
                      chars[s]=(char)(cnt+'0');
                    }
                s++;
                }
            }
        }
        return s;
    }
}
