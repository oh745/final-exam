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


}