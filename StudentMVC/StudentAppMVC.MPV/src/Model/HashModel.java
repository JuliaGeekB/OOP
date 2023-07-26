package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class HashModel implements iGetModel{
    private HashMap <Integer,Student> students  = new HashMap<Integer,Student>();
    
    public HashModel(HashMap<Integer ,Student> students) {
        this.students = students;
     } 
    
    public Student getStudent(Integer id){
        return students.get(id);
    }

    // метод формирования списка студента в HashMap
    public void addStudent(Student student){
        students.put(student.getId(), student);
    }

    // метод удаления студента
    public void deleteStudent(Integer id){
        if (!students.containsKey(id)){
            throw new IllegalArgumentException("Студент с таким id не существует");
        }
        students.remove(id);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> outList = new ArrayList<>();
        for(Student s : students.values())
        {
            outList.add(s);
        }
        return outList;
    }
      
    
    @Override
    public void deleteStudent(String id) {
        students.remove(id);
    }

}
