package DIP;

public class Main {
    public static void main(String[] args){
        Onomatopoeia speak = new Onomatopoeia();
        Dog dog = new Dog();
        Cat cat = new Cat();
        speak.setAnimalSound(dog);
        speak.sound();
        speak.setAnimalSound(cat);
        speak.sound();

    }
}
