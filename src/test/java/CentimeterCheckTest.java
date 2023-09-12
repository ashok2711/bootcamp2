import org.junit.jupiter.api.Test;
import org.tw.unitcheck.Centimter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentimeterCheckTest {

    @Test
    void shouldReturnTrueIf1cmSameAs1cm(){
        final String value1 = "1cm";
        final String value2 = "1cm";
        final boolean expectedResult = true;
        Centimter centimter = new Centimter();
        boolean result = centimter.checkObjectsAreSame(value1, value2);
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnFalseIf1cmSameAs1cm(){
        final String value1 = "1cm";
        final String value2 = new String("1cm");
        final boolean expectedResult = false;

        Centimter centimter = new Centimter();
        boolean result = centimter.checkObjectsAreSame(value1, value2);
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnTrueIf1cmEqualsAs1cm(){
        final String value1 = "1cm";
        final String value2 = "1cm";
        final boolean expectedResult = true;

        Centimter centimter = new Centimter();
        boolean result = centimter.checkObjectsAreEqual(value1, value2);
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnFalseIf1cmNotEqualsAs2cm(){
        final String value1 = "1cm";
        final String value2 = "2cm";
        final boolean expectedResult = false;

        Centimter centimter = new Centimter();
        boolean result = centimter.checkObjectsAreEqual(value1, value2);
        assertEquals(expectedResult, result);
    }
}
