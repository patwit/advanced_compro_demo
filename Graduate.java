public class Graduate extends S{
    String thesisTitle;

    public Graduate(String name, int year, String thesisTitle){
        super(name, year);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle(){
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle){
        this.thesisTitle = thesisTitle;
    }

    public String toString(){
        return super.toString() + " Thesis title:" + thesisTitle;
    }
}
