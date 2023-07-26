import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HashModel;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
       

       List<Student> students = new ArrayList<Student>();
       Student s1 = new Student("Сергей",  21, 101);
       Student s2 = new Student("Андрей",  22, 111);
       Student s3 = new Student("Иван", 22, 121);
       Student s4 = new Student("Игорь", 23, 301);
       Student s5 = new Student("Даша",  25, 171);
       Student s6 = new Student("Лена",  23, 104);
       students.add(s1);
       students.add(s2);
       students.add(s3);
       students.add(s4);
       students.add(s5);
       students.add(s6);

       //ModelFile fModel = new ModelFile("StudentDB.txt");
       //fModel.saveAllStudentToFile(students);

       


       HashMap<Integer, Student> stHash = new HashMap<>();
       stHash.put(s1.getId(), s1);
       stHash.put(s2.getId(), s2);
       stHash.put(s3.getId(), s3);
       stHash.put(s4.getId(), s4);
       stHash.put(s5.getId(), s5);
       stHash.put(s6.getId(), s6);
       
       HashModel hModel = new HashModel(stHash);


       
       //iGetModel modelFile = fModel;
       //iGetModel model = new ModelList(students);
       
       // в iGetModel передаем список HashModel
       iGetModel hashModel = hModel;
       iGetView view = new ViewEng();

       Controller control = new Controller(hashModel, view);

       //control.update();
       control.run();

    }
}