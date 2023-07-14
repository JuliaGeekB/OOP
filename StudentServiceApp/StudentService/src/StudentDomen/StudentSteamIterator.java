package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> course;
    public StudentSteamIterator (List<StudentGroup> course){
        this.course=course;
        this.counter=0;
    }
    @Override
    public boolean hasNext() {
        return counter <course.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        return course.get(counter++);
    }
  
    
}
