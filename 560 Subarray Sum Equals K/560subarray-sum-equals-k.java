class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
    int ps=0;
    int sum=0;
    map.put(0,1);
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];

            if(map.containsKey(ps-k)){
               sum+=map.get(ps-k);
            }
           
                map.put(ps, map.getOrDefault(ps, 0) + 1);
        }

          
return sum;
        

    }
}