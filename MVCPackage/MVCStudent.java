package MVCPackage;

public class MVCStudent {
    public static void main(String[] args){
        StudentModel rahul = retrieveFromDataBase();
        StudentView display = new StudentView();
        StudentController control = new StudentController(rahul,display);
        control.updateView();
        control.setStudentName("Rahul");
        control.updateView();


    }
    public static StudentModel retrieveFromDataBase(){
        StudentModel model = new StudentModel();
        model.setName("rahul");
        model.setRollNo(1);
        return model;
    }
}
