package CPE_STAR_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Doom_Day_14 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);
            String date = y + "/" + x + "/" + 2011;
            Date myDate = sdf.parse(date);
            sdf.applyPattern("EEEEEEE");
            String sMyDate = sdf.format(myDate);
            System.out.println(sMyDate);
        }
    }
}
