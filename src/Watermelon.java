import java.util.Scanner;

import static java.lang.System.in;

public class Watermelon {
    public static void main(String[] args) {
        Scanner reader = new Scanner(in);

        System.out.print("Enter watermelon weight: ");
        int num = reader.nextInt();
        while ((num = reader.nextInt())>0) {
            if (num % 2 == 0)
                System.out.println("Is it odd dividable?:" + " YES");
            else
                System.out.println("Is it odd dividable?:" + " NO");
        }
        }
}

