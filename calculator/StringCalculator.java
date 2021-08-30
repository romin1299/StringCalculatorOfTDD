package calculator;

import java.util.ArrayList;
import java.util.List;


public class StringCalculator {
    public int Add(String numbers) {
 
        String delimiter=",|\n";
        String[] s=new String[]{};
        //List<Integer> negativeNumbers = new ArrayList<Integer>();
        
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
            if(Integer.parseInt(numbers)<0)
            {
                throw new RuntimeException("Negatives not allowed: " + Integer.parseInt(numbers));
            }
            return Integer.parseInt(numbers);
        }
        int sum=Integer.parseInt(s[0]);
        for(int i=1;i<s.length;i++)
        {
            if(Integer.parseInt(s[i])<=1000)
            {
                sum+=Integer.parseInt(s[i]);
            }
        }
        
            
    
        return sum;
    }
    
}
