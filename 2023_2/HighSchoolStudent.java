public class HighSchoolStudent extends Student3{
    private int grade;


    public HighSchoolStudent() {
        super();
    }


    public HighSchoolStudent(int grade) {
        super();
        this.grade = grade;
    }

    public HighSchoolStudent(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return super.toString() + " grade = " + grade;
    }

    
    
}
