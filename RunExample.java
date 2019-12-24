/**
 * RunExample
 */
public class RunExample {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "A";
        s1.GPA = 3.75;

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