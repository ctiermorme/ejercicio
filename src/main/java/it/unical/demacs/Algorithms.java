package it.unical.demacs;

public class Algorithms {

    /**
     * Checks if a given sentence is palindrome or not
     *
     * @param str It is a String that cannot be null
     * @return a boolean value
     * @throws IllegalArgumentException if the input parameter is null
     */
    public boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        if (str.length() < 2) {
            return true;
        }
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        while (left < (str.length() - 1) / 2) {
            if (str.charAt(left) != str.charAt(str.length() - 1 - left)) {
                return false;
            }
            left++;
        }
        return true;
    }

    /**
     * +
     * Given a non-null ordered array of integers, searches for the target number in the array
     *
     * @param numbers Non-null ordered array of numbers
     * @param target  Number to be found in the array
     * @return If the target is in the array, it returns its index, otherwise -1
     * @throws IllegalArgumentException if the numbers array is null
     */
    public int binarySearch(int[] numbers, int target) {
        if (numbers.length == 0) {
            return -1;
        }
        int left = 0;
        int right = numbers.length ;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            }

            if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }


}