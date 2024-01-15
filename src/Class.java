public class Class {
    public static void main(String[] args) {

        Person bob = new Person();
        bob.displayInfo();

        Person tom = new Person("Tom"); // створення об'єкту
        tom.displayInfo();

        Person sam = new Person("Sam", 25);
        sam.displayInfo();



    }
}
class Person{
    String name;
    int age;

    /*початок блоку ініціалізатора*/
    {
       name = "Undefined";
       age =  18;

    }
    Person(){

    }
    /*кінець блоку ініціалізатора*/
    Person(String name)
    {
        this(name, 18);
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \t Age: %d\n", name, age );
    }
}

