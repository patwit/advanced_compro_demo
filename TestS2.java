public class TestS2 {
    public static void main(String[] args){

        System.out.println(Undergrad2.getNumberOfS());
        Undergrad2 s1 = new Undergrad2();
        Undergrad2 s2 = new Undergrad2("Superman");
        Undergrad2 s3 = new Undergrad2(1);
        Undergrad2 s4 = new Undergrad2(3.25);
        Undergrad2 s5 = new Undergrad2("Mickey Mouse", 3, 4.00);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(Undergrad2.getNumberOfS());

        /*S superman = new S("Superman", 1);
        Undergrad yod = new Undergrad("Yod", 2, 3.00);
        Graduate thomas = new Graduate("Thomas", 1, "How to use ChatGPT");
        System.out.println(superman);
        System.out.println(yod);
        System.out.println(thomas);
        */
    }
}
