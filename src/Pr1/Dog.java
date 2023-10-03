package Pr1;

public class Dog {
    private String name;
    private  int age;
    /* Конструктор класса Dog с параметрами name и age */
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* Конструктор класса Dog с параметром n */
    public String getName() {
        return name;
    }
    /* Конструктор класса Dog без параметров */
    public void setName(String name) {
        this.name = name;
    }
    /* возвращает имя собаки */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public String intoHumanAge(){
        return name + "'s age in human years is " + age*7 + " years.";
    }
}