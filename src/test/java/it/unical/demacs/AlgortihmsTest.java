package it.unical.demacs;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class AlgortihmsTest {

    //Test on isPalindrome
    private Algorithms algorithms = new Algorithms();

    @ParameterizedTest
    @CsvSource({"Anna","Angolo bar a Bologna"})
    public void isPalindromeTrueTest(String a){

        Assertions.assertTrue(algorithms.isPalindrome(a));
    }

    @ParameterizedTest
    @CsvSource({"Ciao","Nicco"})
    public void isPalindromeFalseTest(String a){

        Assertions.assertFalse(algorithms.isPalindrome(a));
    }

   @Test
   public void isPalindromeShouldThrowExceptionWithNullValue() {
       Assertions.assertThrows(IllegalArgumentException.class, () -> {algorithms.isPalindrome(null);});
   }

   @Test
    public void stringLenghtMinorThanTwoShouldBeTrue() {

       Assertions.assertTrue(algorithms.isPalindrome("a"));

   }

   //test on binarySearch

    @Test
    public void emptyListShouldReturnMinusOne() {

        int[] number = new int[]{};
        Assertions.assertEquals(-1,algorithms.binarySearch(number,1));

    }

    @ParameterizedTest
    @CsvSource({"50,4","60,5","101,8"})
    public void binarySearchTest(int value, int found) {

        int[] numbers = new int[]{1, 5, 8, 9, 50, 60, 80, 90, 101};
        Assertions.assertEquals(found,algorithms.binarySearch(numbers,value));

    }

    @Test
    public void binarySearchTestFailed() {
        int[] numbers = new int[]{1, 5, 8, 9, 50, 60, 80, 90, 101};

        Assertions.assertEquals(-1,algorithms.binarySearch(numbers,200));

    }



}
