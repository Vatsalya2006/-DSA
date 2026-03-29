class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm1= new HashMap<>();
        HashMap<Character,Character> hm2= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char a= s.charAt(i);
            char b= t.charAt(i);
            if(hm1.containsKey(a)) //  check if map contains character
            {
                if(hm1.get(a)!=b) // if character contained does not matches the ch of 2nd string
                {
                    return false;
                }
            }
            else
                {
                hm1.put(a,b); // else if ch not there map the ch with each other
                }
            if(hm2.containsKey(b)) // same for checking the 2nd string for no errors
            {
                if(hm2.get(b)!=a)
                {
                    return false;
                }
            }
             else
                {
                    hm2.put(b,a);
                }
            

        }
        return true;
    }
}