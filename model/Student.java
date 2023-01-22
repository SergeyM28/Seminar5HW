package model;

import java.time.LocalDate;
import java.util.Map;

public class Student {

    private String firstName;
    private String lastName;

    private Map<LocalDate, Boolean> studentAttendance;

    public Student(String firstName, String lastName, Map<LocalDate, Boolean> studentAttendance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentAttendance = studentAttendance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Map<LocalDate, Boolean> getStudentAttendance() {
        return studentAttendance;
    }

}
