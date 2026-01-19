class Solution {
    public int[] plusOne(int[] digits) {
        int k=0;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]==9)
            digits[i]=0;
            else
            {
            digits[i]++;
            return digits;
            }
        } 
       int[] nodigits= new int[digits.length+1];
       nodigits[0]=1;
       return nodigits;
    
        }
}