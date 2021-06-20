//35. Search Insert Position
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.


class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            if(nums[i]>target)
            {
                return i;
            }
        }
        return n;
    }
}
