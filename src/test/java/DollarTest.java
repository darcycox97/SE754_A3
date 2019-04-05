import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DollarTest {
    @Test
    public void testDollarDivision() {
// Given
        Dollar ten = new Dollar(10);
// When
        Dollar result = ten.dividedBy(2);
// Then
        assertEquals(new Dollar(5), result);
    }

    @Test(expected=ArithmeticException.class)
    public void testDollarDividedByZero() {
// Given
        Dollar ten = new Dollar(10);
// When
        ten.dividedBy(0);
    }
}
