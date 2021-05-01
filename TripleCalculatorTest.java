package com.company;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleCalculatorTest {
@Test
    public void multypl3Test (int x) {
        TripleCalculator res= new TripleCalculator();
        assertEquals(24,res.calc(8));

    }
}