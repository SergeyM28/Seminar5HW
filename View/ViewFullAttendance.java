package View;

import model.AttendanceService;
import model.Student;

import java.util.List;
import java.util.Map;


public class ViewFullAttendance extends View {

    private List<Student> studentList;

    public ViewFullAttendance(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Map<String, Double> print() {
       return new AttendanceService(studentList).showStudentsAttendance();
    }
}
