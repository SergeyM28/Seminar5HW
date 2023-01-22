package View;

import model.AttendanceService;
import model.Student;

import java.util.List;
import java.util.Map;

public class ViewLowPerformingStudents extends View{
    private List<Student> studentList;

    public ViewLowPerformingStudents(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Map<String, Double> print() {
        return new AttendanceService(studentList).showLowPerformingStudents();
    }
}
