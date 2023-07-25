package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class Controller {

    private iGetModel model;
    private iGetView view;
    
    private List<Student> students = new ArrayList<>();

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students)
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update()
    {
        //MVP
        students = model.getAllStudents();
        if(testData(students))
        {
           view.printAllStudents(students);

        }
        else
        {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    public void run()
    {
        Scanner scanner = new Scanner (System.in);

        Command com = Command.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                case DELETE:
                    view.prompt("Enter student ID to delete: "); // вводится id студента для удаления
                    String id = scanner.nextLine();
                    try{
                        model.deleteStudent(id);
                        view.prompt("Successful");

                    }catch(IllegalArgumentException e){// ошибка, если id студента не найден
                        view.prompt("ошибка");
                    }

                    
                    break;

            }

        }
    }

    
}