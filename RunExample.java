/**
 * RunExample
 */
public class RunExample {

    public static void main(String[] args) {

        GradStudent s7 = new GradStudent();
        s7.setName("Z");
        System.out.println(s7.getName());
        s7.setThesisTitle("AI is tking over the world.");
        System.out.println(s7.getThesisTitle());

        int x;
        // Student s4 = new Student();
        // s4.setName("C");
        // s4.setGPA(2.10);

        Student s4 = new Student("C", 2.10);
        Student s5 = new Student(4.00);
        Student s6 = new Student();



        Student s1 = new Student();
        s1.setName("A");
        System.out.println(s1.getName());

        System.out.println(s1.name);
        System.out.println(s1.GPA);
        System.out.println(Student.school);

        Student.hi();
        s1.bye();

        Student s2 = new Student();
        s2.name = "B";
        s2.GPA = 2.50;
        System.out.println(s2.name);
        System.out.println(s2.GPA);
        System.out.println(Student.school);
        Student.hi();
        s2.bye();

        Student s3 = new Student();
        s3.name = s1.name;
        System.out.println(s3.name);
        System.out.println(s1.name);
        s3.name = "A2";
        System.err.println(s3.name);
        System.out.println(s1.name);
    }
}