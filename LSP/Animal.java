package LSP;

public interface Animal {
    default public void walk(){
        System.out.println("walk with their legs");
    }
    default void eat(){
        System.out.println("eats food");
    }
}
