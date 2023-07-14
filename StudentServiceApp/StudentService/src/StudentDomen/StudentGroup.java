package StudentDomen;

import java.util.Iterator;
import java.util.List;

import javax.xml.stream.events.Comment;

import org.w3c.dom.css.Counter;

public class StudentGroup implements Iterable<Student> , Comparable<StudentGroup>{
    private List<Student> group;
    private Integer idGroup; // новое поле
    private Integer numberOfStudents; // новое поле

    public StudentGroup(List<Student> group, Integer idGroup, Integer  numberOfStudents) {
        this.group = group;
        this.idGroup = idGroup;
        this.numberOfStudents=numberOfStudents;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    // переопределение метода: вывод идентификатор группы, количество студентов и список студентов
     @Override
    public String toString() {
        return "idGroup=" + idGroup +
                ", количество студентов-" + numberOfStudents + "\n"+
                group;
    }

    @Override
    public Iterator<Student> iterator() {
       return new Iterator<Student>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<group.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public Student next() {            
            return group.get(counter++);
        }
        
       };
        
    }
    
    @Override
    public int compareTo (StudentGroup o) {

        if(this.numberOfStudents==o.numberOfStudents){
            if (this.idGroup==o.idGroup){
                return 0;
            }
            if (this.idGroup<o.idGroup){
                return -1;
            }
            return 1;
        }
        if(this.numberOfStudents<o.numberOfStudents){
            return -1;
        }
        return 1;        
    }
    
}