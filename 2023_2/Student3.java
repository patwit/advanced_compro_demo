public class Student3 {
    protected String name;
    private static int numberOfStudent;

    public Student3(){
        this.name = "no name";
        numberOfStudent++;
    }

    public Student3(String name){
        this.name = name;
        numberOfStudent++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumberOfStudent() {
        return numberOfStudent;
    }

    public static void setNumberOfStudent(int numberOfStudentTemp) {
        numberOfStudent = numberOfStudentTemp;
    }


    @Override
    public String toString() {
        return " name='" + getName() + "'" +"Number of Student = "+numberOfStudent;
    }


}
