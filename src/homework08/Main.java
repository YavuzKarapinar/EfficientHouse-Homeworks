package homework08;

public class Main {
    public static void main(String[] args) {
        Behavior.run();
    }
}

class Behavior {
        public static void run() {
            Human human = new Human();
            human.name = "Yavuz";
            human.nutritureType = "Omnivore";
            eatWhat(human);

            Gorilla gorilla = new Gorilla();
            gorilla.name = "Grillya";
            gorilla.nutritureType = "Herbivore";
            eatWhat(gorilla);

            Dog dog = new Dog();
            dog.name = "Findik";
            dog.nutritureType = "Carnivore";
            eatWhat(dog);


        }

        public static void eatWhat(Human human) {
            System.out.printf("%s is %s%n", human.name, human.nutritureType);
        }

        public static void eatWhat(Gorilla gorilla) {
            System.out.printf("%s is %s%n", gorilla.name, gorilla.nutritureType);
        }

        public static void eatWhat(Dog dog) {
            System.out.printf("%s is %s%n", dog.name, dog.nutritureType);
        }
}

class Human {
    public String name;
    public String nutritureType;
}

class Gorilla {
    public String name;
    public String nutritureType;
}

class Dog {
    public String name;
    public String nutritureType;
}

