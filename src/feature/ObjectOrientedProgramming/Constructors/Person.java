package feature.ObjectOrientedProgramming.Constructors;

public class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------------");
    }


    public static void main(String[] args) {
        Person p1 = new Person("Komal", 21);
        p1.display();

        // Clone using copy constructor
        Person p2 = new Person(p1);
        p2.display();
    }
}

