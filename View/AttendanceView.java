package View;

import model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AttendanceView<T extends View> {

    private List<T> viewList;

    public AttendanceView(List<Student> studentList) {

        ViewFullAttendance vfa = new ViewFullAttendance(studentList);
        ViewSortedAttendance vsa = new ViewSortedAttendance(studentList);
        ViewLowPerformingStudents vlps = new ViewLowPerformingStudents(studentList);
        this.viewList = new ArrayList<>();
        viewList.add((T)vfa);
        viewList.add((T)vsa);
        viewList.add((T)vlps);
    }

    public void printAttendance (Integer num){
        System.out.println(viewList.get(num).print());
    }


}
