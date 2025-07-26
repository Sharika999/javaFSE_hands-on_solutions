// File: CalculatorServiceTest.java

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;


// Define the interface to be mocked
interface CalculatorService {
    int add(int a, int b);
}

public class CalculatorServiceTest {

    CalculatorService calculatorService;

    @Before
    public void setUp() {
        calculatorService = mock(CalculatorService.class);
    }

    @Test
    public void testAddition() {
        when(calculatorService.add(5, 3)).thenReturn(8);
        assertEquals(8, calculatorService.add(5, 3));
    }
}
