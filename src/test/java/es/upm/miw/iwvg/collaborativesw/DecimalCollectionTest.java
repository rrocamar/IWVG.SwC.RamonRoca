package es.upm.miw.iwvg.collaborativesw;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DecimalCollectionTest {
    private DecimalCollection decimalCollection;

    @BeforeEach
    void before() {
        this.decimalCollection = new DecimalCollection();
        this.decimalCollection.add(2.0);
        this.decimalCollection.add(-1.0);
        this.decimalCollection.add(3.0);
        this.decimalCollection.add(2.0);
    }

    @Test
    void testDecimalCollection() {
        this.decimalCollection = new DecimalCollection();
        assertEquals(0, this.decimalCollection.size());
    }

    @Test
    void testSize() {
        assertEquals(4, this.decimalCollection.size());
    }

    @Test
    void testAdd() {
        assertEquals(4, this.decimalCollection.size());
        this.decimalCollection.add(31.0);
        assertEquals(5, this.decimalCollection.size());
    }

    @Test
    void testSum() {
        assertEquals(6.0, this.decimalCollection.sum(), 10e-5);
    }

    @Test
    void testSumArithmeticExceptionIfEmpty() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> new DecimalCollection().sum());
        LogManager.getLogger(this.getClass()).debug(exception.getMessage());
    }

    @Test
    void testHigher() {
        assertEquals(3.0, this.decimalCollection.higher(), 10e-5);
    }

    @Test
    void testLower() {
        assertEquals(-1.0, this.decimalCollection.lower(), 10e-5);
    }

    @Test
    void testHigherArithmeticExceptionIfEmpty() {
        assertThrows(ArithmeticException.class, () -> new DecimalCollection().higher());
    }

}