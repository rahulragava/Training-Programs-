package ISP;

public class Running implements RunningAthelete{
    String name;
    Running(String person){
        name = person;
    }
    @Override
    public void compete() {
        System.out.println(String.format("%s is competing in running race",name));
    }

    @Override
    public String run() {
        return "run faster";

    }
}
