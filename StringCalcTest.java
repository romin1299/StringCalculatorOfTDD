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
        Assert.assertEquals(6, calc.Add("1\n2,3"));
    }
}
