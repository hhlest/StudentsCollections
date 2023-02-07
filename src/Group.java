import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Group implements Serializable {
    private String groupName;
    private ArrayList<Student> students = new ArrayList<>();

    public Group() {
    }

    public Group(String groupName) {
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) /*throws GroupOverflowException*/ {
        students.add(student);
        return;

    }
    //throw new GroupOverflowException("No free space in the group.");


    public Student searchStudentByLastName(String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLastName().equals(lastName)) {
                return students.get(i);
            }
        }
        return null;
    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getId() == id) {
                students.set(i, null);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Student> sortStudentsByLastName() {
        Collections.sort(students, new StudentsNameComparator());
        return students;
    }

    @Override
    public String toString() {
        String result = "Group: " + groupName + "\n";
        for (Student item : students) {
            result += item + "\n";
        }
        return result;
    }
}
