package Pr1;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Kartoshka", 2);
        Dog d2 = new Dog("Ogurec", 20);
        Dog d3 = new Dog("Pomidor", 1);
        d3.setAge(1);
        System.out.println(d1);
        System.out.println(d1.intoHumanAge());
        System.out.println(d2.intoHumanAge());
        System.out.println(d3.intoHumanAge());

    }
}