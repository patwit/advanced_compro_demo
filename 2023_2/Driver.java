public class Driver {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.numberOfStudent++;
        s1.name = "Nobita";
        s1.sayHi();
        Student.getnumBerofStudent();
        Student s2 = new Student();
        Student.numberOfStudent++;
        s2.name = "Doraemon";
        s2.sayHi();
        Student.getnumBerofStudent();
    }
}
