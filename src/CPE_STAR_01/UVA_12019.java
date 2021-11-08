// 10/28 - No7
package CPE_STAR_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UVA_12019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            sc.nextLine();

            int count = 1;

            if (map.containsKey(s)) {
                count = map.get(s) + 1;
            }

            map.put(s, count);
        }

        for (String s : map.keySet()) {
            System.out.println(s + " " + map.get(s));
        }
    }
}
