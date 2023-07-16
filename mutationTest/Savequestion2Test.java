package mutationTest;

import org.junit.Assert;
import org.junit.Test;

public class Savequestion2Test {
    @Test
    public void Savequestion2Test() throws Exception {
       int value;
        value = Savequestion2.doStuff("(a) ","a",4);
        Assert.assertEquals(3,value);
        value = Savequestion2.doStuff("(b) ","a",4);
        Assert.assertEquals(2,value);
        value = Savequestion2.doStuff("","a",0);
        Assert.assertEquals(-1,value);
    }
}