package Controller;

import java.util.List;

import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudents();
    
    // метод удаления студента
    public void deleteStudent(String id);    
}