import java.util.Scanner;

public class RomanToInteger2 {

    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        while (1 <= s.length() && s.length() <= 15){

            //Create an empty array that stores the converted integer value from roman numbers
            int[] result = new int[s.length()];

            //Loop through all the characters in the string
            for (int i = 0; i < s.length(); i++) {
                char c = Character.toUpperCase(s.charAt(i));

                //If the character c is 'M', assign 1000 to result at index i
                if (c == 'M') result[i] = 1000;

                    //If the character c is 'D', assign 500 to result at index i
                else if (c == 'D') result[i] = 500;

                    //If the character c is 'C', assign 100 to result at index i
                else if (c == 'C') result[i] = 100;

                    //If the character c is 'L', assign 50 to result at index i
                else if (c == 'L') result[i] = 50;

                    //If the character c is 'X', assign 10 to result at index i
                else if (c == 'X') result[i] = 10;

                    //If the character c is 'V', assign 5 to result at index i
                else if (c == 'V') result[i] = 5;

                    //If the character c is 'I', assign 1 to result at index i
                else if (c == 'I') result[i] = 1;
            }


            //Create a variable to store the sum of the result
            int sum = 0;

            //Loop through all the characters in the string
            for (int i = 0; i < s.length() - 1; i++) {
                //If the value in the result array at current index is less than the value of the result array at the next  index, subtract the current index value from the sum
                if (result[i] < result[i + 1]) sum -= result[i];

                    //Else add the value in the result array at the current index to the sum
                else sum += result[i];
            }

            //Add the last index of result array to the sum
            sum += result[s.length() - 1];


            System.out.println("Your number is: " + sum);
            s = scanner.nextLine();
        }
        System.out.println("Incorrect value " + s.length());
    }
}



