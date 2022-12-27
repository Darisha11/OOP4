package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataProcessorTest {

    private DataProcessor<Coffee> dataProcessor;

    @BeforeEach
    void setUp() {
        Coffee.n = 0;
        List<Coffee> coffees = List.of(
                new Coffee(20, 2, 10, 5),
                new Coffee(15, 7, 5, 10),
                new Coffee(10, 5, 0, 5),
                new Pirog(30, 2),
                new Pirog(35, 4)
        );

        dataProcessor = new DataProcessor<>(coffees);
    }

    @Test
    void getAnotherCoffees() throws MyException {
        MyException exception = assertThrows(MyException.class, () -> dataProcessor.getAnotherCoffees(20, 10));
        assertEquals("Нижняя граница больше верхней", exception.getMessage());

        List<AnotherCoffee> anotherOperations = List.of(
                new AnotherCoffee(1, 20, 2, 10, 5),
                new AnotherCoffee(2, 15, 7, 5, 10));
        assertIterableEquals(anotherOperations, dataProcessor.getAnotherCoffees(10, 20));
    }

    @Test
    void searchCost() throws MyException {
        assertEquals("Нет данных", dataProcessor.searchCost(25));

        AnotherCoffee operation = new AnotherCoffee(1, 20, 2, 10, 5);
        assertEquals(operation.getInfo(), dataProcessor.searchCost(20));

        MyException exception = assertThrows(MyException.class, () -> dataProcessor.searchCost(-10));
        assertEquals("Стоимость меньше 0", exception.getMessage());
    }

}


