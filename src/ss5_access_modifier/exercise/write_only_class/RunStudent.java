package ss5_access_modifier.exercise.write_only_class;

import java.util.Scanner;

public class RunStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your name ");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.println(" enter your class ");
        String classes = scanner.nextLine();
        student.setClasses(classes);
        student.display();
    }
}
