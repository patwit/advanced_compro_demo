public class CatDriver {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        System.out.println(c1.getName()+ " " +c1.getGender() + " " +c1.getColor());
        Cat c2 = new Cat("Garfield", "Male", "Yellow");
        System.out.println(c2.getName()+" " +c2.getGender() + " " +c2.getColor());
        System.out.println(c1);
        System.out.println(c2);
    }
}
