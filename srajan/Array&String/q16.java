// 238. Product of Array Except Self
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prod=1;
        int zero=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
            prod=prod*nums[i];
            }
            else
            {
                zero++;
            }
        }
         for(int i=0;i<n;i++)
        {
            if(zero>1)
            {
                nums[i]=0;
            }
            else if(zero==1)
            {
            if(nums[i]==0)
            {
                nums[i]=prod;
            }
            else
            {
              nums[i]=0;
            }
            }
            else
            {
                nums[i]=prod/nums[i];
            }
        }
    return nums;
    }
}
