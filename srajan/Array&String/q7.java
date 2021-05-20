//977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=nums.length;
        int ans[]=new int[l];
        int left=0;
        int right=l-1;
        int curr=l-1;
        while(left<=right)
        {
            if(Math.abs(nums[left]) < Math.abs(nums[right]) )
            {
                ans[curr]=nums[right]*nums[right];
                right--;
            }
            else
            {
                 ans[curr]=nums[left]*nums[left];
                 left++;
            }
            curr--;
        }
        return ans;
    }
}
