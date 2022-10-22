package TA.MidExam;

public class Q2 {
    public static void main(String[] args) {
        Employee[] members = {
                new EmployeeType01("James Chen", "123456789", 300000, 0.08),
                new EmployeeType01("Kevin Wang", "987654321", 250000, 0.07),
                new EmployeeType02("David Chiang", "112233445", 150000, 0.03, 12000),
                new EmployeeType02("Amigo Chang", "555556666", 200000, 0.035, 10000)
        };

        for (Employee p : members) {
            System.out.printf("%s\n", p);
        }
    }
}

class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("id:%s,name:%s", this.getId(), this.name);
    }

    public double getTotalSalary() {
        return 0;
    }
}

class EmployeeType01 extends Employee {
    private double sales;
    private double ratio;

    public EmployeeType01(String name, String id, double sales, double ratio) {
        super(name, id);
        this.sales = sales;
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return String.format("%s,salary:%d", super.toString(), (int) this.getTotalSalary());
    }

    @Override
    public double getTotalSalary() {
        return this.sales * this.ratio;
    }
}

class EmployeeType02 extends Employee {
    private double sales;
    private double ratio;
    private double baseSalary;


    public EmployeeType02(String name, String id, double sales, double ratio, double baseSalary) {
        super(name, id);
        this.sales = sales;
        this.ratio = ratio;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return String.format("%s,base_salary:%d,salary:%d", super.toString(), (int) this.getBaseSalary(), (int) this.getTotalSalary());
    }

    @Override
    public double getTotalSalary() {
        return this.baseSalary + this.sales * this.ratio;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
