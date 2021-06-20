// 468. Validate IP Address
// Given a string IP, return "IPv4" if IP is a valid IPv4 address, "IPv6" if IP is a valid IPv6 address or "Neither" if IP is not a correct IP of any type.


class Solution {
    public String validIPAddress(String IP) {
        int n=IP.length();

        if(IP.contains(".") && !IP.contains(".."))
        {
            if(IP.charAt(0)=='.' || IP.charAt(IP.length()-1)=='.')
            {
                return "Neither";
            }
            String arr[]=IP.split("\\.");
            int n1=arr.length;
            if(n1!=4)
            {
                return "Neither";
            }
            else
            {
                for(int i=0;i<n1;i++)
                {
                    int val=0;
                 try {
                     val = Integer.parseInt(arr[i]);
                 }
                 catch(Exception e)
                 {
                     return "Neither";
                 }
                    if(val>=0 && val<=255 && !(arr[i].startsWith("0") && arr[i].length()>1))
                    {
                    }
                    else
                    {
                        return "Neither";
                    }
                }
                return "IPv4";
            }
        }
        else if(IP.contains(":")  && !IP.contains("::"))
        {
            if(IP.charAt(0)==':' || IP.charAt(IP.length()-1)==':')
            {
                return "Neither";
            }

            String arr[]=IP.split(":");
            int n1=arr.length;

            if(n1!=8)
            {
                return "Neither";
            }
            else
            {
                for(int i=0;i<n1;i++)
                {
                    int n2=arr[i].length();
                    if(n2>4 || n2<1)
                    {
                        return "Neither";
                    }
                    for(int j=0;j<n2;j++)
                    {
                        if((arr[i].charAt(j)>='a' && arr[i].charAt(j)<='f')||(arr[i].charAt(j)>='A' && arr[i].charAt(j)<='F')||(arr[i].charAt(j)>='0' && arr[i].charAt(j)<='9'))
                        {

                        }
                        else
                        {
                            return "Neither";
                        }
                    }
                }
                return "IPv6";
            }
        }
        else
        {
            return "Neither";
        }

    }
}
