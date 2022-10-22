package CSCETA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] store_Hired = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] store_Birth = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        String firstNames = sc.next();
        String lastNames = sc.next();

        Date birth = new Date(store_Birth[0], store_Birth[1], store_Birth[2]);
        Date hired = new Date(store_Hired[0], store_Hired[1], store_Hired[2]);
        String str = "";

        if (birth.checkMonth())
            if (birth.checkDay()) {
                if (hired.checkMonth())
                    if (hired.checkDay()) {
                        Employee employee = new Employee(firstNames, lastNames, birth, hired);
                        str = employee.toString();
                    } else {
                        System.out.println("Date Format Error!");
                        System.exit(1);
                    }
                else {
                    System.out.println("Month out of range!");
                    System.exit(1);
                }
            } else {
                System.out.println("Date Format Error!");
                System.exit(1);
            }
        else {
            System.out.println("Month out of range!");
            System.exit(1);
        }

        System.out.println(str);
    }
}

class Date {
    private final int year;
    private final int month;
    private final int date;
    private final int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int date, int year) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public boolean checkMonth() {
        return month > 1 && month < 13;
    }

    public boolean checkDay() {
        return date > 1 && date < daysPerMonth[month - 1];
    }

    @Override
    public String toString() {
        return month + "/" + date + "/" + year;
    }
}

record Employee(String firstNames, String lastNames, Date birth, Date hire) {

    @Override
    public String toString() {
        return lastNames + ", " + firstNames + "\nHired: " + hire.toString() + "\nBirthday: " + birth.toString();
    }
}