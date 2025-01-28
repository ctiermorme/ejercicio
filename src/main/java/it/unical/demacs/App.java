package it.unical.demacs;

public class App {
    public static void main(String[] args) {
        Algorithms alg = new Algorithms();
        String sent = "Angolo bar a Bologna";
        System.out.println("Is Palindrome: " + alg.isPalindrome(sent));
        int[] numbers = new int[]{1, 5, 8, 9, 50, 60, 80, 90, 101,2001};
        int target = 9;
        int found = alg.binarySearch(numbers, target);
        System.out.println(found != -1 ? target + " found at: " + found : target + " not found");
    }
}
