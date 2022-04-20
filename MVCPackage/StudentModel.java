package MVCPackage;

public class StudentModel {
    private String name;
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
}
