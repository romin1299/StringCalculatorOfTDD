package calculator;


public class StringCalculator {
    public int Add(String numbers) {
        String[] s=new String[]{};
        s=numbers.split(",");
        
        if(numbers.isEmpty())
        {
            return 0;
        }
        if(s.length==1)
        {
            return Integer.parseInt(s[0]);
        }
        int sum=Integer.parseInt(s[0]);
        for(int i=1;i<s.length;i++)
        {
            sum+=Integer.parseInt(s[i]);
        }
        return sum;
    }
}
