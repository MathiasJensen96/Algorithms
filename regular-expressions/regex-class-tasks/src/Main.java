import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Task 1
        //Write a regular expression to match valid email addresses
        System.out.println(Pattern.matches("([a-zA-Z0-9])*@([a-zA-Z0-9])*\\.([a-z])*", "testEmail96@gmail.com"));
        //Write a regular expression to match phone numbers in the format (XXX) XXX-XXXX
        System.out.println(Pattern.matches("\\(([0-9]*)\\) ([0-9]*)-([0-9]*)", "(123) 456-7891"));
        //Write a regular expression to match dates in the format MM/DD/YYYY
        System.out.println(Pattern.matches("[0-9]*/[0-9]*/[0-9]*", "10/25/2023"));

        //Task 2
        //Write a regular expression to match strings containing only lowercase letters
        System.out.println(Pattern.matches("[a-z]*", "abcdefg"));
        //Write a regular expression to match strings containing at least one digit
        System.out.println(Pattern.matches("[a-z0-9]*", "abcd5efg"));
        //Write a regular expression to match strings with at least one special character (e.g., !@#$%^&*)
        System.out.println(Pattern.matches("[a-z\\!@#$%^&*]*", "abcd@efg"));

        //Task 3
        //Write a regular expression to match strings that have exactly three consecutive vowels
        System.out.println(Pattern.matches("[aeioyu]{3}", "aeabcdeiyfg"));
    }
}