import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomen.Person;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;


public class App {
    public static void main(String[] args) throws Exception {

        // group4580
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);

        // group1500
        Student s10 = new Student("Алена", 19, 001);
        Student s20 = new Student("Анна", 18, 002);
        Student s30 = new Student("Анжела", 20, 003);
        Student s40 = new Student("Антон",  21, 004);

        List<Student> listStudA = new ArrayList<Student>();
        listStudA.add(s10);
        listStudA.add(s20);
        listStudA.add(s30);
        listStudA.add(s40);

        StudentGroup group1500 = new StudentGroup(listStudA, 1500);

        // group2525
        Student s100 = new Student("Белла", 23, 007);
        Student s200 = new Student("Борис", 18, 1);
        Student s300 = new Student("Бритни", 20, 2);
        Student s400 = new Student("Бэн",  21, 3);

        List<Student> listStudB = new ArrayList<Student>();
        listStudB.add(s100);
        listStudB.add(s200);
        listStudB.add(s300);
        listStudB.add(s400);

        StudentGroup group2525 = new StudentGroup(listStudB, 2525);


        List<StudentGroup> course1000 = new ArrayList<StudentGroup>();
        course1000.add(group1500);
        course1000.add(group2525);

        List<StudentGroup> course2000 = new ArrayList<StudentGroup>();
        course2000.add(group4580);

        StudentSteam course0001 = new StudentSteam(course1000, 1);
        StudentSteam course0002 = new StudentSteam(course2000, 2);

        System.out.println("======1 поток=======");
        System.out.println(course0001);

        for(StudentGroup std : course0001)
        {
              System.out.println(std);
        }





        //System.out.println(group4580);

        // for(Student std : group4580)
        // {
        //      System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for(Student std: group4580.getGroup())
        // {
        //      System.out.println(std);
        // }


        //Student s1 = new Student("Иван", 25, 121);
        //Student s2 = new Student("Игорь", 23, 301);

    }
}