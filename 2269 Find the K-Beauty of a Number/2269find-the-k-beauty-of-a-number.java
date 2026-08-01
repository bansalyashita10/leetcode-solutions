class Solution {
    public int divisorSubstrings(int num, int k) {
        int kBeauty = 0;
        String str = String.valueOf(num);
        
        for(int i = 0; i <= str.length() - k; i++) {
            String part = str.substring(i, i + k);
            int value = Integer.parseInt(part);
            if(value != 0 && num % value == 0) {
                kBeauty++;
            }
        }
        return kBeauty;
    }
}