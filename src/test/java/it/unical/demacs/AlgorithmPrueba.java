package it.unical.demacs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;


public class AlgorithmPrueba {
    private Algorithms algorithms = new Algorithms();
    //hola
    @ParameterizedTest
    public void IsPalindromeTrueTest(String a){
        Assertions.assertTrue(algorithms.isPalindrome(a));
    }
    @ParameterizedTest
    public void IsPalindromeFalseTest(String a){
        Assertions.assertFalse(algorithms.isPalindrome(a));
    }
    @Test
    public void isPalindromeShouldThrownError(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{algorithms.isPalindrome(null);});
    }
    @Test
    public void stringLenghtMinorThanTwo(){
        Assertions.assertTrue(algorithms.isPalindrome("a"));
    }
    @Test
    public void BinarySearchNull() {
        int numbers = new int []{};
        Assertions.assertEquals(-1,algorithms.binarySearch(numbers,1));
    }
    @ParameterizedTest
    public void BinarySearchTest(int value, int found ){
        int[] numbers = new int[]{1, 5, 8, 9, 50, 60, 80, 90, 101};
        Assertions.assertEquals(found,algorithms.binarySearch(numbers,value));
    }
    @Test
    public void bynaryTestFailed(){
        int[] numbers = new int[]{2,50,60,93};
        Assertions.assertEquals(-1,algorithms.binarySearch(numbers,200));
    }
}
