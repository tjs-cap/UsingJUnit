import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void TwoPlusTwoShouldEqualFour(){
        var cal = new Calculator();
        assertEquals(4,cal.add(2,2));
    }

    @Test
    void TwoPlusThreeShouldEqualFive(){
        var cal = new Calculator();
        assertEquals(5,cal.add(2,3));
    }

    @Test
    void FourDivideByTwoShouldEqualTwo(){
        var cal = new Calculator();
        assertEquals(2,cal.division(4,2));
    }

    @Test
    void EightDevideByTwoShouldEqualFour(){
        var cal = new Calculator();
        assertEquals(4,cal.division(8,2));
    }
}