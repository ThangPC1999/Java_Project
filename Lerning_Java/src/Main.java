import java.util.Scanner;

public class Main {
    private String name;

    public static void main(String[] args) throws Exception {
        Main obj = new Main();
        // Scanner input = new Scanner(System.in);
        // String userChoise = obj.getUserChoise();
        // String computerChoise = obj.getComputerChoise();
        // String result = obj.getResult(computerChoise, userChoise);
        // System.out.println("User Input: " + userChoise);
        // System.out.println("Computer Choice: " + computerChoise);
        // System.out.println(result);
        // int number = input.nextInt();
        // int reversedNumber = obj.findReverse(number);
        // obj.checkPalindrome(number, reversedNumber);
        // obj.checkPrime(number);
        // char test = '4';
        // int asciiValue = test;
        // System.out.println(asciiValue);
        // Emloyee employee1 = new Emloyee("Felix", 25213.53);

        // // increase salary by 20%
        // employee1.setSalary(20.00);
        // double newSalary = employee1.getSalary();
        // System.out.println("Name: " + employee1.name + "\nNew Salary: " + newSalary);

        // // compute salary of Maria
        // Emloyee employee2 = new Emloyee("Maria", 873223.32);

        // // increase salary by 15.37%
        // employee2.setSalary(15.37);
        // newSalary = employee2.getSalary();
        // System.out.println("Name: " + employee2.name + "\nNew Salary: " + newSalary);
        Game game = new Game();
        game.play();
    }

    class Triangle {
        // create two fields
        int base;
        int height;

        // initialize value of base and height
        Triangle(int base, int height) {
            this.base = base;
            this.height = height;
        }

        // compute the area of the right-angled triangle
        double computeArea() {
            double area = (double) 1 / 2 * (this.base * this.height);
            return area;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int findReverse(int number) {
        int reverse = 0;
        int bientam;

        while (number != 0) {

            bientam = number % 10;
            reverse = reverse * 10 + bientam;
            number = number / 10;
        }
        return reverse;
    }

    public void checkPalindrome(int number, int reversedNumber) {
        if (number == reversedNumber) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

    public void checkPrime(int number) {
        int flag = 0;
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

    }

    public boolean checkSelfDivide(int number) {
        int num = number;
        int digit;

        while (num != 0) {
            // access each digit of num
            // hint: use num % 10 to get the last digit
            digit = num % 10;

            // check if any digit doesn't divide the number
            // if it doesn't, return false
            if (number % digit != 0) {
                return false;
            }
            // remove the last digit of num
            num = num / 10;

        }

        // if all digit divide number
        return true;
    }

    public int findGCD(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }

        }
        return gcd;
    }

    public int findLCM(int num1, int num2) {
        int lcm = 0;
        if (num1 > num2) {
            lcm = num1;
        } else {
            lcm = num2;
        }
        while (true) {

            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;
        }
        return lcm;
    }

    public void checkUEOAI(String text) {
        Scanner input = new Scanner(System.in);
        text = input.nextLine();

        // convert to lowercase
        text = text.toLowerCase();

        // variable to count vowels
        int count = 0;

        // run a for loop across the text string
        for (int i = 0; i < text.length(); ++i) {

            // check if each character is a vowel
            // Hint: Use this comparison text.charAt(i) == 'a' with each lowercase vowel
            // characters
            // Separate each comparison with the || operator (comparison1 || comparison2 ||
            // ...)
            boolean result = ((text.charAt(i) == 'a') ||
                    (text.charAt(i) == 'e') ||
                    (text.charAt(i) == 'i') ||
                    (text.charAt(i) == 'o') ||
                    (text.charAt(i) == 'u'));

            if (result) {

                // increase the value of count by 1.
                count++;
            }
        }

        System.out.println(count);

        input.close();
    }

    public void countUeoai(String text) {
        // Replace ___ with your code

        // get input value for string
        Scanner input = new Scanner(System.in);
        text = input.nextLine();

        // convert the string input to lowercase for simplicity
        // hint: use toLowerCase() method
        text = text.toLowerCase();

        // variable to count the number of vowels
        int vowels = 0;

        // run a for loop to access each character of a string
        // hint: run loop from 0 to string.length() - 1
        for (int i = 0; i <= text.length() - 1; ++i) {

            // access each character using charAt()
            char x = text.charAt(i);

            // check if each character is vowel of not
            // hint: compare x with all vowel characters using ||
            if ((x == 'a') || (x == 'e') || (x == 'i') || (x == 'o') || (x == 'u')) {
                // increase the value of vowels by 1
                vowels++;
            }
        }

        System.out.println(vowels);
        input.close();
    }

    public void printSPecialCharacters(String text) {
        Scanner input = new Scanner(System.in);
        text = input.nextLine();

        // run a for loop to access each character of a string
        // hint: run loop from 0 to string.length() - 1
        for (int i = 0; i < text.length(); i++) {

            // access each character using charAt()
            char x = text.charAt(i);

            // check if the string falls in the range from 'a' to 'z' or 'A' to 'Z'
            // hint: use >= 'a' and <= 'z' for both cases
            if ((x >= 'a') && (x <= 'z') || (x >= 'A') && (x <= 'Z')) {

                // if true, skip the current iteration of loop
                continue;
            }

            // print x if it doesn't fall in the range
            System.out.println(x);
        }

        input.close();
    }

    public void UpperCaseFirstIndex(String text) {
        Scanner input = new Scanner(System.in);
        text = input.nextLine();

        // use substring() to split the input string to two strings
        // first substring contains the first letter
        // hint: to access first letter, use indexes 0 and 1
        String firstLetter = text.substring(0, 1);

        // second substring contains the remaining letters
        // hint: to use remaining letters, use indexes 1 and string.length()
        String remainingLetters = text.substring(1, text.length());

        // change the first letter to uppercase
        firstLetter = firstLetter.toUpperCase();

        // join the two substrings
        text = firstLetter.concat(remainingLetters);
        System.out.println(text);

        input.close();
    }

    public void checkUniversity(String Uni, int marks) {
        Scanner input = new Scanner(System.in);

        // get university input
        String university = input.nextLine();

        // get marks input
        marks = input.nextInt();

        // outer if condition to check the university
        if (university.equals("Unique University")) {

            // passing mark for this university is 80
            if (marks > 80) {
                System.out.println("Student Passed");
            } else {
                System.out.println("Student Failed");
            }
        }
        // if the student is not from the Unique University
        else {

            // passing mark for all other universities is 32
            if (marks > 32) {
                System.out.println("Student Passed");
            } else {
                System.out.println("Student Failed");
            }
        }

        input.close();
    }

    public String getComputerChoise() {
        int randomNumber = (int) (Math.random() * 3 + 1);
        String computerChoise;
        if (randomNumber == 1) {
            computerChoise = "rock";
        } else if (randomNumber == 2) {
            computerChoise = "paper";
        } else {
            computerChoise = "scissors";
        }
        return computerChoise;
    }

    public String getUserChoise() {
        Scanner input = new Scanner(System.in);
        String userChoise = input.nextLine();
        userChoise = userChoise.toLowerCase();
        return userChoise;
    }

    public String getResult(String computerChoise, String userChoise) {
        if (computerChoise.equals(userChoise)) {
            return "draw";
        } else if (userChoise.equals("paper") && computerChoise.equals("rock")) {
            return "win";
        } else if (userChoise.equals("rock") && computerChoise.equals("scissors")) {
            return "win";
        } else if (userChoise.equals("scissors") && computerChoise.equals("paper")) {
            return "win";
        }

        // all other conditions result in the user losing
        else {
            return "lose";
        }
    }
}
