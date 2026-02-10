import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    double marks;

    // Constructor
    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }


    void displayInfo() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("----------------------");
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details of Student " + i);

            System.out.print("Enter Roll No: ");
            int r = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double m = sc.nextDouble();

            // Creating object of Student class
            Student s = new Student(r, name, m);

           
            s.displayInfo();
        }

        sc.close();
    }
}
