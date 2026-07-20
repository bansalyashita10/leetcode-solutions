class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
           map.put(num,map.getOrDefault(num,0)+1);
        }
        boolean duplicate=false;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                duplicate=true;
            }
        }
        return duplicate;
    }
}