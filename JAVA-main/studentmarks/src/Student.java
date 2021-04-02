import java.util.Arrays;

public class Student {

    private String name;
    private int no_subjects;
    private String[] subjects;
    private int[] marks;
    private int total_marks;
    private char [] grades;
    private double average;


    public Student(String name, int no_subjects, String[] subjects, int[] marks) {
        this.name = name;
        this.no_subjects = no_subjects;
        this.subjects = subjects;
        this.marks = marks;
        this.setTotal_marks();
        this.setAverage();
        this.setGrades();
    }

    public void setTotal_marks() {
        int total = 0;
        for(int i = 0 ; i<marks.length; i++)
            total += marks[i];
        this.total_marks = total;
    }

    public int getTotal_marks() {
        return total_marks;
    }

    public void setAverage() {
        int total = getTotal_marks();
        average = (double)total/(this.no_subjects);
        this.average = average;
    }

    public void setGrades() {
        char [] grades = new char[this.no_subjects];
        for(int i = 0 ; i< no_subjects; i++)
        {
            if(this.marks[i] < 45)
                grades[i] = 'F';
            else
                grades[i] = 'P';
        }

        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getNo_subjects() {
        return no_subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = " + name +
                ", no_subjects = " + no_subjects +
                ", subjects = " + Arrays.toString(subjects) +
                ", marks= " + Arrays.toString(marks) +
                ", total_marks= " + total_marks +
                ", grades= " + Arrays.toString(grades) +
                ", average= " + average +
                '}';
    }
}
