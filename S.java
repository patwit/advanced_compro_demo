public class S {
    //instance variables
    private String name;
    private int year;
    
    protected static int numberOfS=0;

    //class variables
    private static String school = "KKU";

    public S(){
        name = "Unknown";
        year = 0;
        numberOfS++;
    }

    public S(String name){
        this.name = name;
        year = 0;
        numberOfS++;
    }

    public S(String name, int year){
        this.name = name;
        this.year = year;
        numberOfS++;
    }

    public S(int year){
        name = "unknown";
        this.year = year;
        numberOfS++;
    }
    

    //instance methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static String getSchool() {
        return school;
    }

    //class methods
    static public void cheer(){
        System.out.println("Cheeer Cheer cheer");
    }

    public String toString(){
        return "Name:" + name + " Year:" + year;
    }


    public static int getNumberOfS(){
        return numberOfS;
    }
}
