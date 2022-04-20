package ISP;

public class LongJump implements JumpingAthelete{
    String name;
    public LongJump(String person) {
        name = person;
    }

    @Override
    public void compete() {
        System.out.println(String.format("%s is competing in long jump",name));
    }

    @Override
    public String jump() {
        return "Jump longer";
    }
}
