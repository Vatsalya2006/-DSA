class Solution {
    public List<String> fizzBuzz(int n) {
    List<String> answer = new ArrayList<>();
        int a=1;
            while(a<=n)
            {
                if(a%5==0 && a%3==0)
                {
                answer.add("FizzBuzz");
                }
                else if(a%5==0)
                {
                    answer.add("Buzz");                    
                }
                else if(a%3==0)
                {
                    answer.add("Fizz");
                }
                else
                {
                answer.add(String.valueOf(a));
                }
                a++;
            }
        return answer;
    }
}