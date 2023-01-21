public class TestS {
    public static void main(String[] args) {
        System.out.println("Number of S = " + S.getNumberOfS() );
        S s1 = new S();

        System.out.println("Number of S = " + S.getNumberOfS() );


        S s2 = new S("Superman");
        S s3 = new S("Mickey Mouse", 1);
        S s4 = new S(4);
        s1.toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("Number of S = " + S.getNumberOfS() );
        //s1.toString()

        S2 s5 = new S2();
        System.out.println(s5);
        System.out.println("Number of S = " + S.getNumberOfS() );
    }
    
}
