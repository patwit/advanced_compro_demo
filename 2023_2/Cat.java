public class Cat {
    private String name;
    private String gender;
    private String color;


    public Cat(String name, String gender, String color) {
        this.name = name;
        this.gender = gender;
        this.color = color;
    }

    public Cat() {
        this.name = "no name";
        this.gender = "no gender";
        this.color = "no color";
    }

    public Cat(String name){
        this.name = name;
        this.gender = "no gender";
        this.color = "no color";
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public String toString() {
        return "*******" + 
            " name:'" + this.name + "'" +
            ", gender:'" + getGender() + "'" +
            ", color:'" + getColor() + "'" +
            "********";
    }

}
