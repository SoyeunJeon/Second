import java.util.ArrayList;
import java.util.List;

/**
 * Created by 전소연 on 11/2/2017.
 */
public class StudentManagerInMemory implements StudentManager {

    private List<Student> list = new ArrayList<Student>();

    public List<Student> getAllStudents() {
        Student student = new Student();
        student.setName("1");
        student.setAge(2);
        list.add(student);
        return list;
    }
}
