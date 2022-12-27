package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PirogTest {

    Pirog pirog1, pirog2;

    @BeforeEach
    void prepareData() {
        pirog1 = new Pirog(30, 2);
        pirog2 = new Pirog(35, 4);
    }

    @Test
    void getCost() {
        assertEquals(30, pirog1.getCost());
        assertEquals(35, pirog2.getCost());
    }

    @Test
    void getZakaz() {
        assertEquals(2, pirog1.getZakaz());
        assertEquals(4, pirog2.getZakaz());
    }
}