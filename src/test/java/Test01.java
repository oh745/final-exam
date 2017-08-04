import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test01{


        Final01 final01 = new Final01();

        @Test
        public void oneDigit(){
            long actualResult = final01.findMax(9);
            long expectedResult = 9;
            assertEquals(expectedResult, actualResult);
        }

    @Test
    public void twoDigit(){
        long actualResult = final01.findMax(10);
        long expectedResult = 9;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void threeDigit(){
        long actualResult = final01.findMax(132);
        long expectedResult = 129;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void threeDigit2(){
        long actualResult = final01.findMax(111);
        long expectedResult = 111;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void fourDigit(){
        long actualResult = final01.findMax(1200);
        long expectedResult = 1199;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void fourDigit2(){
        long actualResult = final01.findMax(1186);
        long expectedResult = 1179;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void veryMuchDigit2(){
        long actualResult = final01.findMax(1111110);
        long expectedResult = 999999;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void threeDigit3(){
        long actualResult = final01.findMax(100);
        long expectedResult = 99;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void veryMuchDigit3(){
        long actualResult = final01.findMax(124);
        long expectedResult =124;
        assertEquals(expectedResult, actualResult);
    }
   /* @Test
    public void veryMuchDigit(){
        long actualResult = final01.findMax(111111111111111110);
        long expectedResult = 99999999999999999;
        assertEquals(expectedResult, actualResult);
    }*/

}