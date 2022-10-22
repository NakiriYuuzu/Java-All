package TA.HW02;

public class Teacher {
    private String name;
    private int basicPayment;
    private int studyPayment;
    private int otPayment;
    private int overtime;

    public Teacher(String name, int basicPayment, int studyPayment, int otPayment, int overtime) {
        this.name = name;
        this.basicPayment = basicPayment;
        this.studyPayment = studyPayment;
        this.otPayment = otPayment;
        this.overtime = overtime;
    }

    public String getName() {
        return name;
    }

    public int getPayment() {
        return (otPayment * overtime) + basicPayment + studyPayment;
    }

    public int getBonus() {
        return (int) ((basicPayment + studyPayment) * 1.2);
    }
}
