import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        final int expected = 3;

        final int actual = Week4.max2Int(1, 3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMax2Int2(){
        final int expected = 1;

        final int actual = Week4.max2Int(-1, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMax2Int3(){
        final int expected = 0;

        final int actual = Week4.max2Int(-2, 0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMax2Int4(){
        final int expected = 100;

        final int actual = Week4.max2Int(1, 100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMax2Int5(){
        final int expected = 11;

        final int actual = Week4.max2Int(11, 10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinArray1(){
        final int expected = 11;

        int[] arr = {133, 232, 345, 44, 11};

        final int actual = Week4.minArray(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinArray2(){
        final int expected = 10;

        int[] arr = {10, 22, 33, 44, 99};

        final int actual = Week4.minArray(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinArray3(){
        final int expected = 2001;

        int[] arr = {11111, 22245, 3001, 2001, 4589};

        final int actual = Week4.minArray(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinArray4(){
        final int expected = 29122011;

        int[] arr = {41231546, 51234845, 39867545, 29122011, 45678686, 63342315};

        final int actual = Week4.minArray(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinArray5(){
        final int expected = -4;

        int[] arr = {-1, -2, -3, -4, 0};

        final int actual = Week4.minArray(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateBMI1(){
        final String expected = "Thiếu cân";

        final String actual = Week4.calculateBMI(50, 1.8);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateBMI2(){
        final String expected = "Bình thường";

        final String actual = Week4.calculateBMI(70, 1.75);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateBMI3(){
        final String expected = "Thừa cân";

        final String actual = Week4.calculateBMI(75, 1.75);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateBMI4(){
        final String expected = "Béo phì";

        final String actual = Week4.calculateBMI(80, 1.75);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateBMI5(){
        final String expected = "Bình thường";

        final String actual = Week4.calculateBMI(48, 1.6);

        Assert.assertEquals(expected, actual);
    }
}