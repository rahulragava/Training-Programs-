package ISP;

public class Hurdle implements RunningAthelete,JumpingAthelete{
    String name;
    public Hurdle(String person) {
        name = person;
    }

    @Override
    public void compete() {
        System.out.println(String.format("%s is competing in hurdle race",name));
    }

    @Override
    public String jump() {
        return "Hurdle consist of both jumping ";
    }

    @Override
    public String run() {
        return "and running";

    }
}
