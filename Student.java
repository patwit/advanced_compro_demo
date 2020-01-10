/**
 * Student
 */
public class Student extends Person{
// state
    private String name; //instance variable
    private double GPA;
    static String school = "KKU";   //class variable  

    public Student(){
        this.name = "";
        this.GPA = 0.0;
    }   

    public Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
    }

    public Student(double GPA){
        this.name = "No name";
        this.GPA = GPA;
    }


    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    double getGPA(){
        return GPA;
    }
    void setGPA(double GPA){
        this.GPA = GPA;
    }

    //behavior
    static void hi(){
        System.out.println("KKU hi");
    }

    void bye(){
        System.out.println(name + " say bye.");
    }

    @Override
    public String toString(){
        return name + " : " + GPA;
    }

    @Override
    public String getNationality() {
        // TODO Auto-generated method stub
        return super.nationality + "(Student)";
    }


}