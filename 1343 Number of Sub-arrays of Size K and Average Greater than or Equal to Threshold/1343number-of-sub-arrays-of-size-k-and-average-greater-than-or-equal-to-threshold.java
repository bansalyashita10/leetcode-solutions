class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int target = k * threshold;               //IMPORTANT
        // create first window
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        if(sum >= target){
            count++;
        }
        // slide window
        for(int i = k; i < arr.length; i++){
            sum += arr[i];       // add new element
            sum -= arr[i-k];     // remove old element
            if(sum >= target){
                count++;
            }
        }
        return count;
    }
}