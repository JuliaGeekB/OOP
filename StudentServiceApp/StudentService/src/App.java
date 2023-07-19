import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Person;
import StudentDomen.PersonAverageAge;
import StudentDomen.PersonComparator;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
import Services.TeacherService;



public class App {
    public static void main(String[] args) throws Exception {
        
        // // group4580
        // Student s1 = new Student("Иван", 25, 121); // вводим данные студентов
        // Student s2 = new Student("Игорь", 23, 301);
        // Student s3 = new Student("Иван", 22, 121);
        // Student s4 = new Student("Игорь",  23, 444);

        // List<Student> listStud = new ArrayList<Student>();// формируем список студентов
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);

        // StudentGroup group4580 = new StudentGroup(listStud, 4580, 4); // формируем объект Группа студентов

        // group1500
        Student s10 = new Student("Алена", 19, 001);
        Student s20 = new Student("Анна", 18, 002);
        Student s30 = new Student("Анжела", 20, 003);
        Student s40 = new Student("Антон",  21, 004);
        Student s50 = new Student("Арсений",  25, 005);

        List<Student> listStudA = new ArrayList<Student>();
        listStudA.add(s10);
        listStudA.add(s20);
        listStudA.add(s30);
        listStudA.add(s40);
        listStudA.add(s50);

        // StudentGroup group1500 = new StudentGroup(listStudA, 1500, 5);

        // // group2525
        // Student s100 = new Student("Белла", 23, 007);
        // Student s200 = new Student("Борис", 18, 1);
        // Student s300 = new Student("Бритни", 20, 2);

        // List<Student> listStudB = new ArrayList<Student>();
        // listStudB.add(s100);
        // listStudB.add(s200);
        // listStudB.add(s300);
        

        // StudentGroup group2525 = new StudentGroup(listStudB, 2525, 3);

        // // group2000
        // Student s1000 = new Student("Владислав", 23, 007);
        // Student s2000 = new Student("Вероника", 18, 1);
        // Student s3000 = new Student("Варвара", 20, 2);

        // List<Student> listStudС = new ArrayList<Student>();
        // listStudС.add(s1000);
        // listStudС.add(s2000);
        // listStudС.add(s3000);
        

        // StudentGroup group2000 = new StudentGroup(listStudС, 2000, 3);

        // List<StudentGroup> course1000 = new ArrayList<StudentGroup>(); // формируем список групп студентов
        // course1000.add(group1500);
        // course1000.add(group2525);
        // course1000.add(group2000);

        // List<StudentGroup> course2000 = new ArrayList<StudentGroup>();
        // course2000.add(group4580);

        // StudentSteam course0001 = new StudentSteam(course1000, 1); // формируем объект Поток студентов
        // StudentSteam course0002 = new StudentSteam(course2000, 2);

        // System.out.println("======1 поток=======");
        // //System.out.println(course0001);

        // for(StudentGroup std : course0001) // вывод через Итератор
        // {
        //       System.out.println(std);
        // }
        // System.out.println();
        // System.out.println("======2 поток=======");
        

        // for(StudentGroup std : course0002)
        // {
        //       System.out.println(std);
        // }

        // System.out.println();
        // System.out.println("======Сортировка 1 поток=======");
        // Collections.sort(course0001.getCourse()); // сортировка через compare по количеству студентов 
        // for(StudentGroup std : course0001)
        // {
        //       System.out.println(std);
        // }


        // //System.out.println(group4580);

        // // for(Student std : group4580)
        // // {
        // //      System.out.println(std);
        // // }

        // // System.out.println("=========================================================");

        // // Collections.sort(group4580.getGroup());

        // // for(Student std: group4580.getGroup())
        // // {
        // //      System.out.println(std);
        // // }


        Student s18 = new Student("Иван", 25, 121);
        Student s28 = new Student("Игорь", 23, 301);

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s18, s28);

        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Professor");

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

        //comS.compare(s18, t2);
        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s18, t2);

        Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        //EmploeeController empControll = new EmploeeController();
        // EmploeeController.paySalary(e1);
       // EmploeeController.paySalary(s18);
        //empControll.paySalary(e1);
        //empControll.paySalary(s1);

        // ДЗ 4
        PersonAverageAge<Student> studentAverageAge = new PersonAverageAge<>(null);
        double studentAge = studentAverageAge.getAverageAge(listStudA);
        System.out.println("Средний возраст студентов: "+ studentAge);
    }
}