package calculator;

public class StringCalculator {
    public int Add(String numbers) {
 
        String delimiter=",|\n";
        String[] s=new String[]{};
        if(numbers.startsWith("//"))
        {
            int delimiterIndex = numbers.indexOf("//") + 2;
            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
            numbers = numbers.substring(numbers.indexOf("\n") + 1);
        }
        s=numbers.split(delimiter);

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
