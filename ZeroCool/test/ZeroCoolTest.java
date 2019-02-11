
import java.util.*;
import org.junit.*;
import zerocool.ZeroCool;

public class ZeroCoolTest {

    @Test
    public void myArrayTest()
    {
        ZeroCool ob = new ZeroCool();
        ob.populateArray();
        ob.changeNumbers();
        ob.reduceArraySize(30);

        Assert.assertEquals(Arrays.asList("ZeroCool", "1", "2", "Zero", "4", "Cool", "Zero", "7", "8", "Zero", "Cool", "11", "Zero", "13", "14", "ZeroCool", "16", "17", "Zero", "19", "Cool", "Zero", "22", "23", "Zero", "Cool", "26", "Zero", "28", "29", "ZeroCool"), Arrays.asList(ob.list.toArray()));
    }
}
