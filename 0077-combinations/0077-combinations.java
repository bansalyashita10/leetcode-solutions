class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>nums=new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
       List<List<Integer>>result=new ArrayList<>();
       List<Integer>current=new ArrayList<>();

      generate(nums,0,current,result,k);

      return result;


    }
    public static void generate(List<Integer> nums, int index,
                         List<Integer> current,
                         List<List<Integer>> result,int k){
        if(current.size()==k){
            result.add(new ArrayList<>(current));
            return;
        }
         if (index == nums.size()) {
            return;
        }

        current.add(nums.get(index));
        generate(nums,index+1,current,result,k);

        current.remove(current.size()-1);

        generate(nums,index+1,current,result,k);
    }
}