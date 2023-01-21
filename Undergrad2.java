public class Undergrad2 extends S{
    private double gpa;

    public Undergrad2(){
        //super();
        super.setName("XXX");
        super.setYear(-1);
        numberOfS++;
        this.gpa = 0.00; 
    }

    public Undergrad2(String name){
        super(name);
        this.gpa = 0.00; 
    }

    public Undergrad2(int year){
        super(year);
        this.gpa = 0.00; 
    }

    public Undergrad2(double gpa){
        super();
        this.gpa = gpa; 
    }

    public Undergrad2(String name, int year, double gpa){
        super(name, year);
        this.gpa = gpa; 
    }


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString(){
        return super.toString() + " GPA:" + gpa;
    }
    
}
