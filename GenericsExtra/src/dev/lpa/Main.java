package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;
import dev.lpa.util.QueryItem;
import dev.lpa.util.QueryList;

import java.util.ArrayList;
import java.util.List;

record Employee(String name) implements QueryItem {
    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;

        List<Student> students// ジェネリック型にStudentを渡すとこの配列で有効なのはStudentのみということ
                = new ArrayList<>(); // 可変調
        // Student[] students1 = new Student[studentCount]; // 固定調

        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
        // printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>(); // 可変調
        // Student[] students1 = new Student[studentCount]; // 固定調
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printMoreList(lpaStudents); // (printListに<T>を設定しない場合は)エラーになる ... Required type: List<Student>
        // この制限は変数の参照型とメソッドのパラメータの関係を理解する必要がある
        // 上の students を見てほしい。ジェネリックにStudentを渡しているのでこの配列で有効なのはStudentのみということ
        // この問題のさまざまな解決方法
        // 1. printList(List student) とする。つまりジェネリック型にしない -> 問題： 生のパラメタを利用する


        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches(
                "Course", "Python");
        printMoreList(matches);

        var students2021 = QueryList.getMatches(
                students, "YearStarted", "2021");

        printMoreList(students2021);
    }




    public static void printMoreList(List<? extends Student>students)
            // ? はワイルドカード List<?> unKnownList;
    {

        // Student last = students.get(students.size()-1);
        // students.set(0, last);

        for (var s : students) {
            System.out.println(s.getYearStarted() + ": " + s);
        }
        System.out.println();
    }

    // public static <T extends Student> // 戻り値の指定であるvoidの前にprintListの引数の型を設定
    // void printList(List<T> // 設定した型<T>を指定する（Tを指定すると別の意味になる）
    //                        students // studentsのサブクラス(LPAStudents)は渡すことができない
    // ) {
    //     for (var s : students) {
    //         System.out.println(s);
    //     }
    //     System.out.println();
    // }
}
