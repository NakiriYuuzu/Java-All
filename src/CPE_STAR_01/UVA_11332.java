package CPE_STAR_01;

import java.util.Scanner;

public class UVA_11332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            if (s.equals("0"))
                break;

            System.out.println(solve(s));
        }
    }

    private static int solve(String s) {
        long sum = 0;
        for (int i = 0; i < s.length(); i++)
            sum += Integer.parseInt(s.charAt(i) + "");

        if (sum < 10)
            return (int) sum;
        return solve(sum + "");
    }
}
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    PrintWriter out = new PrintWriter(System.out);