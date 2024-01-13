public class Driver2 {
    public static void main(String[] args) {
        Dog d1 = new Dog(); Dog.number++; d1.number++;
        Dog d2 = new Dog(); Dog.number++;
        Dog d3 = new Dog(); Dog.number++;
        Dog d4 = new Dog(); Dog.number++;
        Dog d5 = new Dog(); Dog.number++;
        d1.name = "Toob";
        d1.color = "Black";
        d2.name = "Kong";
        d2.color = "brown";
        System.out.println(d1.name + " is " + d1.color);
        System.out.println(d2.name + " is " + d2.color);
        System.out.println("There are " + Dog.number + " dogs");
        d1.bark();
        d2.bark();
        d1.eat("bone");
        d2.eat("steak");
        Dog.sleep();
    }
}
