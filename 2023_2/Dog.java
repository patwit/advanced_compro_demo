class Dog{
    // คุณสมบัติ
    String color;  
    private String name;
    static int number; //class variable


    public Dog(String color, String name) {
        this.color = color;
        this.name = name;
    }
    

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ความสามารถ
    void bark(){
        System.out.println("Hong Hong " + color);
    }

    void eat(String food){
        System.out.println(name + " eats "+ food);
    }

    static void sleep(){
        System.out.println("Dog sleep" + name);
    }
}