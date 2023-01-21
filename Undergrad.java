public class Undergrad extends S{
    double gpa;

    public Undergrad(String name, int year, double gpa){
        super(name, year);
        this.gpa = gpa;
    }

    public double getGPA(){
        return gpa;
    }

    public void setGPA(double gpa){
        this.gpa = gpa;
    }

    public String toString(){
        return super.toString() + " GPA:" + gpa;
    }
}
