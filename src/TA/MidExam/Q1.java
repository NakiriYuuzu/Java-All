package TA.MidExam;

public class Q1 {
    public static void main(String[] args) {
        EmployeeType1 james = new EmployeeType1("James Chen", "123456789",
                300000, 0.08);
        EmployeeType1 kevin = new EmployeeType1("Kevin Wang", "987654321",
                250000, 0.07);
        EmployeeType2 david = new EmployeeType2("David Chiang", "112233445",
                150000, 0.03, 12000);
        EmployeeType2 amigo = new EmployeeType2("Amigo Chang", "555556666",
                200000, 0.035, 10000);

        System.out.printf("id:%s,name:%s,salary:%d\n", james.getId(), james.getName(), (int) james.getTotalSalary());
        System.out.printf("id:%s,name:%s,salary:%d\n", kevin.getId(), kevin.getName(), (int) kevin.getTotalSalary());
        System.out.printf("id:%s,name:%s,salary:%d\n", david.getId(), david.getName(), (int) david.getTotalSalary());
        System.out.printf("id:%s,name:%s,salary:%d\n", amigo.getId(), amigo.getName(), (int) amigo.getTotalSalary());
    }
}

class EmployeeType1 {
    private String name;
    private String id;
    private double sales;
    private double ratio;

    public EmployeeType1(String name, String id, double sales, double ratio) {
        this.name = name;
        this.id = id;
        this.sales = sales;
        this.ratio = ratio;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getTotalSalary() {
        return sales * ratio;
    }
}

class EmployeeType2 {
    private String name;
    private String id;
    private double sales;
    private double ratio;
    private double baseSalary;

    public EmployeeType2(String name, String id, double sales, double ratio, double baseSalary) {
        this.name = name;
        this.id = id;
        this.sales = sales;
        this.ratio = ratio;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getTotalSalary() {
        return baseSalary + sales * ratio;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}