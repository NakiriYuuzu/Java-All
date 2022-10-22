import java.io.*;
import java.util.*;

public class HW2 {
    static List<ArrayList> data = new ArrayList<>();
    static List<ArrayList> output = new ArrayList<>();
    static int n;
    static List<ArrayList> totalVisitingPlayStation = new ArrayList<>();

    public static void main(String[] args) {
        int s = 0;
        boolean result;
        String input;
        String[][] graph = new String[0][];
        List<Integer> list = new ArrayList<>();

        try (BufferedReader graphReader = new BufferedReader(new InputStreamReader(new FileInputStream("1102-Program_Assignment_2-ThemePark-input-graph-15.txt")))) {//1102-Program Assignment 2-ThemePark-input-graph-15.txt
            n = Integer.parseInt(graphReader.readLine());
            graph = new String[n+1][n];
            for (int i = 0; i <= n; i++) {
                graph[i] = graphReader.readLine().split(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader queryReader = new BufferedReader(new InputStreamReader(new FileInputStream("1102-Program_Assignment_2-ThemePark-input-query-15.txt")))) {//1102-Program Assignment 2-ThemePark-input-query-15.txt
            s = Integer.parseInt(queryReader.readLine());
            while ((input = queryReader.readLine()) != null) {
                list.add(Integer.parseInt(input));
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }

        for (Integer time : list) {
            int time2 = time;
            List<Integer> list1 = new ArrayList<>();
            list1.add(s);
            time2 -= Integer.parseInt(graph[0][s-1]);
            playStationPlan(s, time2, graph, list1);
            analysisResult(s, time, graph);
            print(s, time, graph);
        }
    }
    public static void playStationPlan(int s, int time, String[][] graph, List<Integer> list1) {
        if (time == 0) {
            data.add((ArrayList) list1);
        } else if (time < 0) {
            list1.remove(list1.size()-1);
            data.add((ArrayList) list1);
        } else {
            String[][] graph2 = new String[n+1][n];
            for (int i = 0; i < graph.length; i++) {
                System.arraycopy(graph[i], 0, graph2[i], 0, graph[i].length);
            }
            graph2[0][s - 1] = "0";
            for (int i = 0; i < graph2[s].length; i++) {
                int time2 = time;
                int s2 = s;
                if (!graph2[s2][i].equals("0")) {
                    int walkTime = Integer.parseInt(graph2[s2][i]);
                    time2 -= walkTime;
                    s2 = i + 1;
                    time2 -= Integer.parseInt(graph2[0][s2 - 1]);
                    List<Integer> list2 = new ArrayList<>(list1);
                    list2.add(s2);
                    playStationPlan(s2, time2, graph2, list2);
                }
            }
        }
    }
    public static void analysisResult(int s, int time, String[][] graph) {
        List<ArrayList> tmp = new ArrayList<>();
        // 判斷終點站是否等於起始站
        for (int i = 0;i<data.size();i++) {
            if (data.get(i).size() > 1) {
                if ((int)data.get(i).get(data.get(i).size()-1) == s) {
                    tmp.add(data.get(i));
                }
            }
        }

        // 找出拜訪最多站的路線
        int max = 0;
        for (int i = 0; i < tmp.size(); i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < tmp.get(i).size(); j++){
                if (!arr.contains((Integer) tmp.get(i).get(j))) {
                    arr.add((Integer) tmp.get(i).get(j));
                }
            }
            if (arr.size() > max) {
                max = arr.size();
            }
            totalVisitingPlayStation.add(arr);
        }

        // 找出最短路徑，避免反復橫跳
        int min = 1000;
        for (int i = 0; i < totalVisitingPlayStation.size(); i++) {
            if (totalVisitingPlayStation.get(i).size() == max) {
                if (tmp.get(i).size() < min) {
                    min = tmp.get(i).size();
                }

                output.add(tmp.get(i));
            }
        }

        tmp.clear();
        for (int i = 0; i < output.size(); i++) {
            if (output.get(i).size() == min) {
                tmp.add(output.get(i));
            }
        }

        // 把重複的路線過濾（即使排序不同也過濾掉）
        output.clear();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < tmp.size(); i++) {
            int sum = 0;

            for (int j = 0; j < tmp.get(i).size(); j++) {
                sum += (Integer) tmp.get(i).get(j);
            }

            if (!arr.contains(sum)) {
                arr.add(sum);
                output.add(tmp.get(i));
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < output.size(); i++) {
            int totalTimeUsing = 0;
            for (int j = 0; j < output.get(i).size()-1; j++) {
                totalTimeUsing += Integer.parseInt(graph[0][(int) output.get(i).get(j)-1]) + Integer.parseInt(graph[(int) output.get(i).get(j)][(int) output.get(i).get(j + 1)-1]);
            }
            list.add(totalTimeUsing);
        }


    }

    public static void print(int s, int time, String[][] graph) {
        if (output.size() > 0){
            System.out.printf("If t = %d: cycle ", time);

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < output.size(); i++) {
                int totalTimeUsing = 0;
                for (int j = 0; j < output.get(i).size() - 1; j++) {
                    totalTimeUsing += Integer.parseInt(graph[0][(int) output.get(i).get(j)-1]) + Integer.parseInt(graph[(int) output.get(i).get(j)][(int) (output.get(i).get(j + 1))-1]);
                }
                list.add(totalTimeUsing);
            }

            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                    index = i;
                }
            }

            for (int i = 0; i < output.get(index).size(); i++) {
                System.out.print(output.get(index).get(i) + " ");
            }

            System.out.print("in time: ");
            String str = null;
            for (int j = 0; j < output.get(index).size() - 1; j++) {
                str += graph[0][(int) output.get(index).get(j)-1] + "+" + graph[(int) output.get(index).get(j)][(int) (output.get(index).get(j + 1))-1] + "+";
            }
            System.out.print(str.substring(4, str.length()-1) + " = " + max);

            System.out.println();
        }
        else {
            System.out.printf("If t = %d, infeasible%n", time);
        }


        data.clear();
        output.clear();
        totalVisitingPlayStation.clear();
    }
}
