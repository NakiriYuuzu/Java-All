import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        University_Data_System data_system = new University_Data_System();

        while (true) {
            System.out.println("======================University_Data_System======================");
            System.out.println("Select 1 = show info by id (only Student), Select 2 = show info by names (all):");
            switch (sc.nextInt()) {
                case 1 -> data_system.showInfoByID();
                case 2 -> data_system.showInfoByName();
                default -> System.exit(1);
            }
        }
    }
}

class University_Data_System {

    public University_Data_System() {}

    Student_Data_System student1 = new Student_Data_System(2000, 4, 10, "ChingChong", 411001, 1);
    Student_Data_System student5 = new Student_Data_System(2000, 5, 20, "LeeHong", 411002, 1);
    Student_Data_System student3 = new Student_Data_System(1999, 6, 6, "DarenChew", 411003, 2);
    Student_Data_System student4 = new Student_Data_System(1998, 7, 7, "Yuuzu", 411004, 3);
    Student_Data_System student2 = new Student_Data_System(1997, 8, 8, "Wp", 411005, 4);

    Teacher_Data_System teacher1 = new Teacher_Data_System(1970, 1, 25, "James", "Chinese");
    Teacher_Data_System teacher2 = new Teacher_Data_System(1998, 7, 22, "Isana", "English");
    Teacher_Data_System teacher3 = new Teacher_Data_System(1969, 2, 2, "McYang", "Math");

    public void showInfoByID() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.sort(Student.compareByID);

        System.out.println("===============STUDENT-INFO===============");

        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println();
    }

    public void showInfoByName() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.sort(Student.compareByNames);

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.sort(Teacher.compareByName);

        System.out.println("===============STUDENT-INFO===============");

        for (Student student : students) System.out.println(student.toString());

        System.out.println("===============TEACHER-INFO===============");

        for (Teacher teacher : teachers) System.out.println(teacher.toString());

        System.out.println();
    }
}

class Student_Data_System extends Student {
    public Student_Data_System(int year, int month, int date, String student_Name, int student_ID, int student_Grade) {
        super(year, month, date, student_Name, student_ID, student_Grade);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Teacher_Data_System extends Teacher {
    public Teacher_Data_System(int year, int month, int date, String teacher_Name, String teacher_Subject) {
        super(year, month, date, teacher_Name, teacher_Subject);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Student {
    private final String student_Name;
    private final int student_ID;
    private final int student_Grade;
    private final int year;
    private final int month;
    private final int date;

    public Student(int year, int month, int date, String student_Name, int student_ID, int student_Grade) {
        this.student_Name = student_Name;
        this.student_ID = student_ID;
        this.student_Grade = student_Grade;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public static Comparator<Student> compareByNames = Comparator.comparing((Student o) -> o.student_Name);

    public static Comparator<Student> compareByID = Comparator.comparingInt(Student::getStudent_ID);

    @Override
    public String toString() {
        return "student_Name='" + student_Name + '\'' +
                ", student_ID=" + student_ID +
                ", student_Grade=" + student_Grade +
                ", year=" + year +
                ", month=" + month +
                ", date=" + date;
    }
}

class Teacher {
    private final String teacher_Name;
    private final String teacher_Subject;
    private final int year, month, date;

    public Teacher(int year, int month, int date, String teacher_Name, String teacher_Subject) {
        this.teacher_Name = teacher_Name;
        this.teacher_Subject = teacher_Subject;
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public static Comparator<Teacher> compareByName = Comparator.comparing(o -> o.teacher_Name);

    @Override
    public String toString() {
        return "teacher_Name='" + teacher_Name + '\'' +
                ", teacher_Subject='" + teacher_Subject + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", date=" + date;
    }
}