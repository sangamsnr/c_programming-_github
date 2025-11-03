package fruits;

public class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Taste: " + taste);
    }

    static class Apple extends Fruit {
        // Constructor for Apple
        Apple() {
            super("Apple", "Sweet", "Medium");
        }

        @Override
        void eat() {
            System.out.println("This is an Apple.");
            System.out.println("It is usually " + taste + " in taste.");
        }
    }

    static class Orange extends Fruit {
        // Constructor for Orange
        Orange() {
            super("Orange", "Citrusy", "Small");
        }

        @Override
        void eat() {
            System.out.println("This is an Orange.");
            System.out.println("It has a " + taste + " flavor.");
        }
    }

    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.eat();
        System.out.println();
        orange.eat();
    }
}


