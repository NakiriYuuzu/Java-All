package TA.MidExam;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guessNumber = sc.nextLine();
        System.out.println(guessNumber + " is " + (isLegal(guessNumber) ? "legal." : "illegal."));
    }


    public static boolean isLegal(String guessNumber) {
        boolean isLegal = true;

        if (guessNumber.length() == 3) {
            for (int i = 0; i < guessNumber.length(); i++)
                for (int j = i + 1; j < guessNumber.length(); j++)
                    if (guessNumber.charAt(i) == guessNumber.charAt(j)) {
                        isLegal = false;
                        break;
                    }
        }
        else
            isLegal = false;

        return isLegal;
    }
}
