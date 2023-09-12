import org.junit.jupiter.api.Test;
import org.tw.unitcheck.Length;
import org.tw.unitcheck.Unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {

    @Test
    void shouldReturnTrueIf1cmSameAs1cm(){
        final Length length1 = new Length(1, Unit.CM);
        final Length length2 = length1;
        final boolean expectedResult = true;

        boolean result = length1.equals(length2);
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnTrueIf1cmNotSameAs1cm(){
        final Length length1 = new Length(1, Unit.CM);
        final Length length2 = new Length(1, Unit.CM);
        final boolean expectedResult = false;

        boolean result = length1.checkObjectsAreSame(length2);
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnTrueWhenIf1cmEqualsAs1cm(){
        final Length length1 = new Length(1, Unit.CM);
        final Length length2 = new Length(1, Unit.CM);
        final boolean expectedResult = true;

        boolean result = length1.equals(length2);
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnFalseWhenComparing1cmTo2cm(){
        final Length length1 = new Length(1, Unit.CM);
        final Length length2 = new Length(2, Unit.CM);
        final boolean expectedResult = false;

        boolean result = length1.equals(length2);
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnTrueWhenComparing1mTo100cm(){
        final Length length1 = new Length(100, Unit.CM);
        final Length length2 = new Length(1, Unit.M);
        final boolean expectedResult = true;

        boolean result = length1.equals(length2);
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnTrueWhenComparing100cmTo1m(){
        final Length length1 = new Length(100, Unit.CM);
        final Length length2 = new Length(1, Unit.M);
        final boolean expectedResult = true;

        boolean result = length2.equals(length1);
        assertEquals(expectedResult, result);
    }

}
