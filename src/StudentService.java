import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> studentList = new ArrayList<>();

    private int counter = 0; //for auto-generating IDs

    public void addStudent(String name, int age, String course, String email) {
        counter++;
        Student student = new Student(counter, age, name, course, email);
        studentList.add(student);
        System.out.println("Student added successfully with ID: " + counter);
    }

    public void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("---------- All Students ----------");
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("----------------------------------");
    }
    public void searchById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }
    public void searchByName(String name) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found with name: " + name);
        }
    }
    public void updateStudent(int id, String name, int age, String course, String email) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setCourse(course);
                student.setEmail(email);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }

    public void deleteStudent(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }
}
