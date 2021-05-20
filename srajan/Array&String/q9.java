// 15. 3Sum
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
// Notice that the solution set must not contain duplicate triplets.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> st=new ArrayList<List<Integer>>();
        Set<List<Integer>> st1=new HashSet<List<Integer>>();

        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int csum=nums[i]+nums[j]+nums[k];
                if(csum==0)
                {
                    ArrayList<Integer> tmp=new ArrayList<Integer>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    // if(!st.contains(tmp))
                    // {
                    // st.add(tmp);
                    // }
                    st1.add(tmp);
                    j++;k--;
                }
                else if(csum>0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }

        st.addAll(st1);
        return st;
    }
}
