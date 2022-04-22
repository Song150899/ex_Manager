import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Student> students;

    public Manager() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public void print() {
        for (int i = 0; i < students.size(); i++) {
//       this.students.forEach(student -> System.out.println(student.toString()));
            System.out.println(students.get(i));
        }
        System.out.println("-------------");
    }

    public int searchById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
