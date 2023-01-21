/**
 * Student
 */
public class Student {
// state
    private String name; //instance variable
    private double GPA;
    static String school = "KKU";   //class variable
    static int numberOfStudent = 0;

    public Student(){
        this.name = "";
        this.GPA = 0.0;
        numberOfStudent++;
    }   

    public Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
        numberOfStudent++;
    }

    public Student(double GPA){
        this.name = "No name";
        this.GPA = GPA;
        numberOfStudent++;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getGPA(){
        return GPA;
    }
    
    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    public String getSchool(){
        return school;
    }

    public static void setSchool(String school2){
        school = school2;
    }

    public static int getNumberOfStudent(){
        return numberOfStudent;
    }

    @Override
    public String toString(){
        return "Name:"+name + " GPA:"+GPA;
    }
}