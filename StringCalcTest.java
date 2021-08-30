import calculator.*;

import org.junit.Assert;
import org.junit.Test;


public class StringCalcTest {
    StringCalculator calc=new StringCalculator();
    @Test
    public void Add_addUpToTwoNumber_SeparatedByCommas()
    {
        Assert.assertEquals(0, calc.Add(""));
        Assert.assertEquals(1, calc.Add("1"));
        Assert.assertEquals(3, calc.Add("1,2"));
    } 
    @Test
    public void Add_addMultipleNumbers()
    {
        Assert.assertEquals(10, calc.Add("1,2,3,4"));
    }
    @Test
    public void Add_addNumberWithNewLineDelimiters()
    {
        Assert.assertEquals(10, calc.Add("1\n2\n3,4"));
    }
    @Test
    public void Add_addNumberWithCustomeDelimiters()
    {
        Assert.assertEquals(3, calc.Add("//;\n1;2"));
    }
    @Test()
    public void Add_raiseAnExceptionOnNegativeNumber()
    {
        try
        {
            calc.Add("-1");
        }
        catch(RuntimeException e)
        {
            Assert.assertEquals("Negatives not allowed: -1 ", e.getMessage());
        }
       
       
    }
    @Test
    public void Add_NumbersgreterThan1000NotIncludeInSum()
    {
        Assert.assertEquals(1003, calc.Add("1,1000,2,3000"));
    }
}
