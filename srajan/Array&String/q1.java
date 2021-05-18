//414. Third Maximum Number
//Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.


class Solution {
    public int thirdMax(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        boolean flg1=false;
        boolean flg2=false;
        boolean flg3=false;

        for(int i=0;i<nums.length;i++)
        {
            // System.out.println(max1);
            // System.out.println(max2);
            // System.out.println(max3);
            // System.out.println(flg1);
            // System.out.println(flg2);
            // System.out.println(flg3);
            // System.out.println();
            if(nums[i]>=max1)
            {
                if(nums[i]!=max1)
                {
                if(flg1&&flg2)
                {
                 max3=max2;
                 flg3=true;
                }
                if(flg1)
                {
                 max2=max1;
                 flg2=true;
                }
                max1=nums[i];
                }
                flg1=true;
            }
            else  if(nums[i]>=max2)
            {
                if(nums[i]!=max2)
                {
                    if(flg2)
                    {
                      max3=max2;
                      flg3=true;
                    }
                  max2=nums[i];
                }
                flg2=true;
            }
            else  if(nums[i]>=max3)
            {
                flg3=true;
                max3=nums[i];
            }
        }

        if(flg3)
        {
            return max3;
        }
        else
        {
            return max1;
        }
    }
}
