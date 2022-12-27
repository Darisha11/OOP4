package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class BaristaTest {

    Barista barista1, barista2;

    @BeforeEach
    void prepareData() {
        barista1 = new Barista("Григорий");
        barista2 = new Barista("Антон");
    }

    @Test
    void getName() {
        assertEquals("Григорий", barista1.getName());
        assertEquals("Антон", barista2.getName());
    }

}