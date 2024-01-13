class Student{
    String name;
    static int numberOfStudent = 0;

    public Student(){
        this.name = "no name";
        numberOfStudent++;
    }

    public Student3

    public void sayHi(){
        System.out.println("Hi. My name is " + name);
    }

    public static void getNumberOfStudent(){
        System.out.println("There are " + numberOfStudent +" students.");
    }
}