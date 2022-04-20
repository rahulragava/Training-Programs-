package LSP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Here dog and cat are substitute for animal");
        System.out.println();

        Dog jimmy = new Dog();
        jimmy.eat();
        jimmy.walk();
        jimmy.barking();

        System.out.println();

        Cat tom = new Cat();
        tom.eat();
        tom.walk();
        tom.meowing();
    }
}
