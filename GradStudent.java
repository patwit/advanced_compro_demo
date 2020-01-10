/**
 * GradStudent
 */
public class GradStudent extends Student{

    private String thesisTitle;

    public GradStudent(){
        super();
        thesisTitle = "";
    }

    public GradStudent(String name, double GPA, String thesisTitle){
        super(name, GPA);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
    	return this.thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
    	this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString(){
        return super.toString() + " : " + this.thesisTitle;
    }
    
}