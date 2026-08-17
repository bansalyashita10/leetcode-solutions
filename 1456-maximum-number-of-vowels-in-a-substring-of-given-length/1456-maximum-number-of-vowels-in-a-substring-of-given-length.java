class Solution {
    public int maxVowels(String s, int k) {
        int noOfVowels=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                noOfVowels++;
            }
        }

        int maxVowels=noOfVowels;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                noOfVowels++;
            }
            if(isVowel(s.charAt(i-k))){
                noOfVowels--;
            }
            maxVowels=Math.max(maxVowels,noOfVowels);  
        }
     return maxVowels;
    }

    public Boolean isVowel(char ch){
        if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}