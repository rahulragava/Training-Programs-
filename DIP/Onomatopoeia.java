package DIP;

public class Onomatopoeia {
    private Animal animal;

    public void setAnimalSound(Animal animal){
        this.animal = animal;
    }
    public void sound(){ animal.speak(); }
}
