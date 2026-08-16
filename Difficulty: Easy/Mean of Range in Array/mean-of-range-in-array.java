class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
         ArrayList<Integer>al=new ArrayList<>();
      int[]ps=new int[arr.length];
      ps[0]=arr[0];
      for(int i=1;i<arr.length;i++){
          ps[i]=ps[i-1]+arr[i];
      }
      
      for(int i=0;i<queries.length;i++){
          int left=queries[i][0];
          int right=queries[i][1];
          
          int noel=right-left+1;
          int mean;
          
          if(left==0){
              mean=ps[right]/noel;
              al.add(mean);
          }
          else{
              mean=(ps[right]-ps[left-1])/noel;
          al.add(mean);
          }
      }
       return al; 
        
    }
}