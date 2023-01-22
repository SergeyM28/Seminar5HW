import View.AttendanceView;
import controller.AttendanceController;
import model.AttendanceService;
import model.Student;

import javax.accessibility.AccessibleText;
import java.sql.Array;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map <LocalDate, Boolean> st1Attendance = new HashMap<>();
        st1Attendance.put(LocalDate.of(2023, 1, 9), true);
        st1Attendance.put(LocalDate.of(2023, 1, 10), false);
        st1Attendance.put(LocalDate.of(2023, 1, 11), true);
        Student st1 = new Student("Harry", "Potter", st1Attendance);

        Map <LocalDate, Boolean> st2Attendance = new HashMap<>();
        st2Attendance.put(LocalDate.of(2023, 1, 9), true);
        st2Attendance.put(LocalDate.of(2023, 1, 10), true);
        st2Attendance.put(LocalDate.of(2023, 1, 11), true);
        Student st2 = new Student("Hermione", "Granger", st2Attendance);

        Map <LocalDate, Boolean> st3Attendance = new HashMap<>();
        st3Attendance.put(LocalDate.of(2023, 1, 9), false);
        st3Attendance.put(LocalDate.of(2023, 1, 10), false);
        st3Attendance.put(LocalDate.of(2023, 1, 11), false);
        Student st3 = new Student("Ron", "Weasley", st3Attendance);

        ArrayList<Student> myStudentGroup = new ArrayList<>();
        myStudentGroup.add(st1);
        myStudentGroup.add(st2);
        myStudentGroup.add(st3);

        AttendanceController ac = new AttendanceController(myStudentGroup);
        ac.chooseAttendance();
    }
}