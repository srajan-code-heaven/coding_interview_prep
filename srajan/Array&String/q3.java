// 941. Valid Mountain Array
// Given an array of integers arr, return true if and only if it is a valid mountain array.


class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        boolean ans=false;
        if(n<3)
        {
            return false;
        }
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                if(ans==false)
                {
                    ans=true;
                }
                else
                {
                    return false;
                }
            }
            if(arr[i]<=arr[i-1] && ans==false )
            {
                return false;
            }
            if(arr[i]<=arr[i+1] && ans==true )
            {
                return false;
            }
        }
        return ans;
    }
}
