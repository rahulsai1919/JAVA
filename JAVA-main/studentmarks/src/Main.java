import java.util.*;

public class Main {

    static Student[] students;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        int min_mark = 45;
        System.out.println("enter number of students");
        n = input.nextInt();
        System.out.println("enter number of subjects");
        m = input.nextInt();
        String [] names = new String[n];
        String [] subjects = new String[m];
        int [][] marks = new int[n][m];
        students = new Student[n];

        System.out.println("enter names");
        for(int i=0;i<n;i++)
        {
            names[i] = input.next();
            //input.nextLine();
        }
        System.out.println("enter subjects");
        for(int i=0; i<m; i++) {
            subjects[i] = input.next();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("enter marks for " + names[i]);
            for(int j=0;j<m;j++)
            {
                marks[i][j] = input.nextInt();
            }
        }


/*
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
            for(String str : subjects)
            {
                System.out.print(str + " ");
            }
            //System.out.println("\n");
            for(int itr : marks[i])
            {
                System.out.print(itr+" ");
            }
            System.out.println("\n");
        }
*/
        for(int i=0;i<n;i++)
        {
            students[i] = new Student(names[i],m,subjects,marks[i]);
        }
        int choice;
        boolean takeinput = true;
        while(takeinput)
        {
            System.out.println("enter your choice (1-6) ");
            choice = input.nextInt();
            if(choice == 1)
            {
                // all info about students
                for(int i=0;i<n;i++)
                {
                    System.out.println(students[i].toString());
                }
            }
            else if(choice == 2)
            {
                // each subject average marks
                System.out.println("each subject average marks");
                for(int i=0;i<m;i++) {
                    String sub = subjects[i];
                    System.out.println(sub +" ------> "+ Subject_averagemarks(sub, n, m));
                }
            }
            else if(choice == 3)
            {
                // highest average subject
                //System.out.println("highest average subject");
                System.out.println("highest average subject is " + Find_highestaverage_subject(subjects));
            }

            else if(choice == 4)
            {
                //higher marks than average - subject wise
                System.out.println("higher marks than average - subject wise");
                higher_markthanaverage(subjects);
            }

            else if(choice == 5)
            {
                //each student number of subjects higher than avg mark with subject name
                System.out.println("each student number of subjects higher than avg mark with subject name");
                for(int i=0;i<n;i++)
                {
                    numberof_subjects_highthan_avgmark(students[i]);
                }

            }

            else if(choice == 6)
            {
                //each subject highest mark student
                System.out.println("each subject highest mark student");
                for(int i = 0; i<m; i++)
                {
                    subject_highest_mark(subjects[i]);
                }
            }

            else if(choice == 7)
            {
                System.out.println("exit");
                takeinput = false;
            }

            else
            {
                System.out.println("Invalid input");
                System.out.println("enter again");
            }

        }
    }

    public static double Subject_averagemarks(String subject,int no_students,int no_subjects)
    {
        //int [] subject_averages = new int[no_subjects];
        int subind=0,subtotal=0;
        for(Student student : students)
        {
//            String[] subjects = student.getSubjects();
//            for(int i=0; i<no_subjects; i++)
//            {
//                if(subjects[i].equals(subject)) {
//                    subind = i;
//                    break;
//                }
//            }
            subind = findindexofsubject(subject);
            int[] marks = student.getMarks();
            subtotal += marks[subind];
        }

        return ((double)subtotal)/no_students;
    }


    public static String Find_highestaverage_subject(String[] subjects)
    {
        double max_avg = 0.0;
        int no_students = students.length;
        String max_avgsubject = new String();
        for(int i=0; i<subjects.length ;i++)
        {
            double avg = Subject_averagemarks(subjects[i],no_students, subjects.length);
            if(avg > max_avg) {
                max_avg = avg;
                max_avgsubject = subjects[i];
            }
        }
        return max_avgsubject;
    }

    public static void higher_markthanaverage(String[] subjects)
    {
        for(int i = 0 ;i< subjects.length;i++)
        {
            System.out.print(subjects[i]+" ----------> ");
            double avg_mark = Subject_averagemarks(subjects[i], students.length, subjects.length);
            int ind = findindexofsubject(subjects[i]);
            for(Student student : students)
            {
                int[] marks = student.getMarks();
                if(marks[ind] > avg_mark)
                    System.out.print(student.getName() + " (" + student.getMarks()[ind] + ")");
            }
            System.out.println("");
        }
    }

    public static int findindexofsubject(String subject)
    {
        int subind=0;
        String[] subjects = students[0].getSubjects();
        for(int i =0; i<subjects.length ;i++)
        {
            if(subject.equals(subjects[i])) {
                subind = i;
                break;
            }
        }
        return subind;
    }

    public static void numberof_subjects_highthan_avgmark(Student student)
    {
        int count = 0;
        String[] subjects = student.getSubjects();
        int[] marks = student.getMarks();
        String[] highthan_avg = new String[subjects.length];
        for (int j = 0; j < subjects.length; j++)
        {
            double avg_mark = Subject_averagemarks(subjects[j], students.length, subjects.length);
            if (marks[j] > avg_mark)
            {
                highthan_avg[count] = subjects[j];
                count++;
            }

        }
        if (count == 0)
            System.out.println("no subjects higher than average");
       else {
            System.out.print(student.getName() + " -------> " + count + " subjects higher than average ------> ");
            for (int j = 0; j < count; j++)
                System.out.print(highthan_avg[j] + " ");
            System.out.println("");
        }

    }

    public static void subject_highest_mark(String subject)
    {
        String max_mark_student = new String();
        int max_mark = 0;
        for(Student student : students)
        {
            int subind = findindexofsubject(subject);
            int subject_mark = student.getMarks()[subind];
            if(subject_mark > max_mark)
            {
                max_mark = subject_mark;
                max_mark_student = student.getName();
            }
        }
        System.out.println("highest mark in " + subject + " ------> " + max_mark_student + " (" +max_mark + ")");
    }



}
