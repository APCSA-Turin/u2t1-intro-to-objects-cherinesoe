public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jason", 8, 10);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Andrew", 3, 9.9);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
