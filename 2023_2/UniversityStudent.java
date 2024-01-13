public class UniversityStudent extends Student3{
    private int year;

    public UniversityStudent(){
        super();
        this.year = 1;
    }

    public UniversityStudent(String name, int year){
        super.name = name;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return super.toString() + "Year = " + year;
    }
}
