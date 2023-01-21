public class TestStudent {
    public static void main(String[] args){
        System.out.println(Student.school);
        System.out.println(Student.numberOfStudent);
        Student s1 = new Student();
        Student s2 = new Student("Mickey Mouse", 4.00);
        Student s3 = new Student(2.00);
        System.out.println (s1);
        System.out.println (s2);
        System.out.println (s3);
        Student.setSchool("Khon Kaen University");
        System.out.println(Student.school);
        System.out.println(Student.numberOfStudent);
        Student.setSchool("KKU");
    }
}
