class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>answer=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }

     for(int num:nums2){
        if(set.contains(num)){
            answer.add(num);
        }
     }
     //convert hashset to int[]

      int[] answerArr = new int[answer.size()];
int i=0;
      for(int num:answer){
        answerArr[i]=num;
        i++;
      }
return answerArr;
    }
}