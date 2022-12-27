package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    Coffee coffee1, coffee2;

    @BeforeEach
    void prepareData() {
        coffee1 = new Coffee(15, 7, 5, 10);
        coffee2 = new Coffee(10, 5, 0, 5);
    }

    @Test
    void getCost() {
        assertEquals(15, coffee1.getCost());
        assertEquals(10, coffee2.getCost());
    }

    @Test
    void getWater() {
        assertEquals(7, coffee1.getWater());
        assertEquals(5, coffee2.getWater());
    }

    @Test
    void getZerna() {
        assertEquals(5, coffee1.getZerna());
        assertEquals(0, coffee2.getZerna());
    }

    @Test
    void getZakaz() {
        assertEquals(10, coffee1.getZakaz());
        assertEquals(5, coffee2.getZakaz());
    }
}