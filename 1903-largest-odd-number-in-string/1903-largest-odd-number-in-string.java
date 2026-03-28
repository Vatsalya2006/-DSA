class Solution {
    public String largestOddNumber(String num) {
        String e="";
        int n=num.length()-1;
        int start=0,end=0;
        for(int i=n;i>=0;i--)
        {
            if((num.charAt(i)-'0')%2!=0)
            {
            end=i;
            return num.substring(start,end+1);
        }
        }
        return "";
    }
}