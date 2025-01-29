package it.unical.demacs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AlgorithmPrueba {

    private static Algorithms algoritmo;

    @BeforeAll
    static void setUp() {
        algoritmo = new Algorithms();
    }

    // Tests para el método isPalindrome

    @ParameterizedTest
    @CsvSource({"moM", "booloob", "un, mim, nu", "ho9oh"})
    public void espalindromoSi(String a) {
        Assertions.assertTrue(algoritmo.isPalindrome(a));
    }

    @Test
    public void tiraError() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            algoritmo.isPalindrome(null);
        });
    }

    @ParameterizedTest
    @CsvSource({"Hoal", "FORNTITE", "1234seguimos", "hola, queso, aloh"})
    public void espalindromoNo(String b) {
        Assertions.assertFalse(algoritmo.isPalindrome(b));
    }

    // Tests para el método binarySearch

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5', 3, 2", "'1,2,3,4,5', 5, 4", "'10,20,30,40,50', 40, 3"})
    public void binarySearchTest(int[] numbers, int target, int expectedIndex) {
        Assertions.assertEquals(expectedIndex, algoritmo.binarySearch(numbers, target));
    }

    @Test
    public void binarySearchEmptyArray() {
        int[] numbers = {};
        int target = 3;
        Assertions.assertEquals(-1, algoritmo.binarySearch(numbers, target));
    }

    @Test
    public void binarySearchNotFound() {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 6;
        Assertions.assertEquals(-1, algoritmo.binarySearch(numbers, target));
    }

    @Test
    public void binarySearchFoundAtStart() {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 1;
        Assertions.assertEquals(0, algoritmo.binarySearch(numbers, target));
    }

    @Test
    public void binarySearchFoundAtEnd() {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 5;
        Assertions.assertEquals(4, algoritmo.binarySearch(numbers, target));
    }

    @Test
    public void binarySearchThrowsExceptionForNullArray() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            algoritmo.binarySearch(null, 3);
        });
    }
}
