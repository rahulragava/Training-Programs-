package MVCPackage;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    StudentController(StudentModel model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public String getStudentName(StudentModel model){
        return model.getName();
    }
    public int getStudentRollNo(StudentModel model){
        return model.getRollNo();
    }
    public void setStudentName(String name){
        this.model.setName(name);
    }
    public void setStudentRollNo(int rollNo){
        model.setRollNo(rollNo);
    }
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
