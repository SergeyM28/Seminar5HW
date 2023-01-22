package model;

import java.util.*;
import java.util.stream.Collectors;

public class AttendanceService {
    private List<Student> studentList;

    public AttendanceService(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Map<String, Double> showStudentsAttendance (){
        Map<String, Double> resultAttendanceMap = new HashMap<>();
        for (Student elem : studentList){
            double tempAttendance = ((double)Collections.frequency(elem.getStudentAttendance().values(), true) / (double)elem.getStudentAttendance().size()) * 100;

            resultAttendanceMap.put(elem.getFirstName() + " " + elem.getLastName(), tempAttendance);
        }
        return resultAttendanceMap;
    }
    public Map<String, Double> showSortedStudenstAttendance(){
        Map<String, Double> sortedMap2 = new TreeMap<>(
                Comparator.comparing(showStudentsAttendance()::get));
        sortedMap2.putAll(showStudentsAttendance());
        return sortedMap2;
    }

    public Map<String, Double> showLowPerformingStudents(){
        Map<String, Double> tempMap = new HashMap<>();
        Map<String, Double> resultAttendanceMap = new HashMap<>(showStudentsAttendance());
        for (Map.Entry<String, Double> entry : resultAttendanceMap.entrySet())
           if (entry.getValue() < 25.0){
               tempMap.put(entry.getKey(), entry.getValue());
           }
        return tempMap;
    }
}
