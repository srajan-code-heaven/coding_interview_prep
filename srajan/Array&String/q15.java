class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        int longest=0;
        int start=0;
        if(n<3)
        {
            return longest;
        }
        for(int i=0;i<n;i++)
        {
            boolean up=false;
            boolean down=false;
            while(i+1<n && arr[i]==arr[i+1])
            {
                i++;
            }
            start=i;
            while(i+1<n && arr[i]<arr[i+1])
            {
                i++;
                up=true;
            }
            if(i+1==n)
            {
                return longest;
            }
            while(i+1<n && arr[i]>arr[i+1])
            {
                i++;
                down=true;
            }
            if(up && down && i-start+1>longest)
            {
              longest=i-start+1;
            }
            if(i+1==n)
            {
                return longest;
            }
            i--;
        }
        return longest;
    }
}
