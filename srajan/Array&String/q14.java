// 896. Monotonic Array
// An array is monotonic if it is either monotone increasing or monotone decreasing.


class Solution {
    public boolean isMonotonic(int[] arr) {
        int n=arr.length;
        boolean l1=true;
        boolean l2=true;
        if(n<=1)
        {
            return true;
        }

            for(int i=0;i<n-1;i++)
            {
                if(arr[i+1]<arr[i])
                {
                    l1= false;
                    break;
                }
            }

          if(l1==true)
          {
              return l1;
          }

            for(int i=0;i<n-1;i++)
            {
                if(arr[i+1]>arr[i])
                {
                    l2= false;
                    break;
                }
            }

        return l1||l2;
    }
}
