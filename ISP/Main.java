package ISP;

public class Main {
    public static void main(String[] args) {
        Running rahul = new Running("rahul");
        rahul.compete();
        System.out.println(rahul.run());
        System.out.println("-------------------------------------------------");

        Hurdle dinesh = new Hurdle("dinesh");
        dinesh.compete();
        System.out.println( dinesh.jump()+dinesh.run());
        System.out.println("-------------------------------------------------");

        LongJump selva = new LongJump("selva");
        selva.compete();
        System.out.println();
        System.out.println(selva.jump());
        System.out.println("-------------------------------------------------");

    }

}
