import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        class Student {
            // creating a student class that contains name rno and marks
            int roll_no;
            String name;
            float marks;

        }
    
        Student[] student_1 =new Student[5];
        Student vraj; // This is just reference variable not an actual object but it will be stored stack memory
        student_1 = new Student(): // Create an actual object which will allocate memory at runtime( Dynamically allocates)
        System.out.println(Arrays.toString(student_1)); // By default the value will be null 
    }
}