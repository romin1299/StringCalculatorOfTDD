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
}
