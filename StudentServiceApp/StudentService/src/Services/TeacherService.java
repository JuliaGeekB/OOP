package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    
    public static final String sortByFIOTchrLst = null;
    private List<Teacher> teachers;
    
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
    
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create (String firstName, int age) {
        Teacher per = new Teacher(firstName, age, firstName);
        
        teachers.add(per);
    }
    
    // метод сортировки 
    public void sortByFIOTchrLst()
    {
       
        teachers.sort( new PersonComparator<Teacher>());
        
    }

}
