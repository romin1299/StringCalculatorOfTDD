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
        return Integer.parseInt(s[0])+Integer.parseInt(s[1]);
    }
}
