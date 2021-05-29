 class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        
        int[] indexes=new int[2];
        for(int i=0;i<n;i++)
        {
            int complement=target-nums[i];
            if(map.containsKey(complement))
            {
                
                indexes=new int[]{i,map.get(complement)};
                map.remove(complement);
                continue;
            }
            map.put(nums[i],i);
            
        }
        Arrays.sort(indexes);

        return indexes;
    }
}
