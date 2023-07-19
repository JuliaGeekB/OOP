package StudentDomen;

import java.util.List;

public class PersonAverageAge<T extends Person> {
    private List userlist;
    public PersonAverageAge(List userList){
        this.userlist=userList;
    }

    public double getAverageAge(List <T> userlist){
        double ageSum=0;
        for (T user: userlist){
            ageSum += user.getAge();
        }
        return ageSum/userlist.size();
    }

}
