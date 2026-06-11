import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        StudentService service = new StudentService();

        while(true)
        {

            System.out.println("\n========= Student Management System =========");

            System.out.println("1. Add student");
            System.out.println("2. View all students");
            System.out.println("3. Search student by ID");
            System.out.println("4. Search student by name");
            System.out.println("5. Update student");
            System.out.println("6. Delete student");
            System.out.println("7. Exit");

            System.out.println("==============================================");


            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    service.addStudent(name, age, course, email);
                    break;

                case 2:
                    service.viewAllStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int searchId = sc.nextInt();
                    service.searchById(searchId);
                    break;

                case 4:
                    System.out.print("Enter student Name: ");
                    String searchName = sc.nextLine();
                    service.searchByName(searchName);
                    break;

                case 5:
                    System.out.print("Enter student ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new course: ");
                    String newCourse = sc.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = sc.nextLine();
                    service.updateStudent(updateId, newName, newAge, newCourse, newEmail);
                    break;

                case 6:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();
                    service.deleteStudent(deleteId);
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter 1-7.");
            }
        }
    }
}
