package controller;

import View.AttendanceView;
import model.Student;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class AttendanceController {
    private List<Student> studentList;

    public AttendanceController(List<Student> studentList) {
        this.studentList = studentList;
    }

    Scanner in = new Scanner(System.in);

    public void chooseAttendance() {
        AttendanceView av = new AttendanceView<>(studentList);
        System.out.print("Добро пожаловать, мистер Дамблдор,\n"+
                "Выберите режим просмотра успеваемости:\n"+
                    "0 - просмотр общей успеваемости \n"+
                "1 - просмотр отсортированной успеваемости \n"+
                "2 - просмотр отстающих студентов\n"+
                "-->  "
        );
        int num = in.nextInt();
        if (num > 2 || num < 0){
            System.out.println("Введено некорректное число. Шалость не удалась");
        }
        av.printAttendance(num);
    }
}
