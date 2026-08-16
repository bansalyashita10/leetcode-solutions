class Solution {
    public int hIndex(int[] citations) {
        int number=0;
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++){
            if(citations[i]>=n-i){
        number = Math.max(number, n - i);
            }
        }
        return number;
    }
}