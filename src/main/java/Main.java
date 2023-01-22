public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog = new Dog();

        Compare compare = new Compare(cat1,cat2);
        Compare compare1 = new Compare(cat1,dog);

    }
}
