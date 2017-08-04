import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by preedaphong.r on 04/08/2560.
 */
public class Test02 {
   Exam02 exam02 = new Exam02();

    @Test
    public void oneDigit(){

        int actualResult = exam02.findCheap();
        int expectedResult = 9;
        assertEquals(expectedResult, actualResult);
    }

}
