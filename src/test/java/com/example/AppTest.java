package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testBasicPlanWithinLimit() {
        assertEquals(300.0, App.calculateBill("basic", 5), 0.01);
    }

    @Test
    public void testBasicPlanExceedsLimit() {
        assertEquals(400.0, App.calculateBill("basic", 15), 0.01);
    }

    @Test
    public void testStandardPlanWithinLimit() {
        assertEquals(500.0, App.calculateBill("standard", 20), 0.01);
    }

    @Test
    public void testPremiumPlanExceedsLimit() {
        assertEquals(900.0, App.calculateBill("premium", 60), 0.01);
    }
}
