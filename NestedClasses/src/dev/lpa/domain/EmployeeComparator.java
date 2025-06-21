package dev.lpa.domain;

import java.util.Comparator;

public class EmployeeComparator // クラス宣言、このクラスは...
        <T extends Employee> // ジェネリック型のパラメータを宣言
        implements Comparator // このクラスにコンパレータクラスを実装することを宣言
        <Employee> // コンパレータクラスはEmployee同士を比較する
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
