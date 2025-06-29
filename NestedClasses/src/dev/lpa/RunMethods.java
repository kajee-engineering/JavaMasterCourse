package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.EmployeeComparator;
import dev.lpa.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {

    public static void main(String[] args) {

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10515, "Joe", 2021, "Walmart"),
                new StoreEmployee(10105, "Tom", 2020, "Macys"),
                new StoreEmployee(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee(10322, "Bud", 2016, "Target"))
        );

        var c0 = new EmployeeComparator<StoreEmployee>();
        var c1 = new Employee.EmployeeComparator<StoreEmployee>();
        var c2 = new StoreEmployee().new StoreComparator<StoreEmployee>();

        // Using local class
        class NameSort<T> implements Comparator<StoreEmployee> {

            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

        // Using anonymous class
        var c4 = new Comparator<StoreEmployee>() // この匿名クラスが実装するインターフェイス
        {
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }; // 閉じ括弧の後のセミコロンを覚えておくことが重要

        var c3 = new NameSort<StoreEmployee>();

        sortIt(storeEmployees, c0);
        sortIt(storeEmployees, c1); // Sorting with Comparator: dev.lpa.domain.Employee$EmployeeComparator@a09ee92 これは$に続くクラス名がネストされたクラスであること示している
        sortIt(storeEmployees, c2);
        sortIt(storeEmployees, c3); // Sorting with Comparator: dev.lpa.RunMethods$1NameSort@4a574795
        sortIt(storeEmployees, c4); // Sorting with Comparator: dev.lpa.RunMethods$1@23fc625e
        // 匿名クラスを使って、ちょっとしたカスタム機能を作り、メソッド引数に渡している
        sortIt(storeEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName())); // 表現は綺麗に見えるが最初は混乱するかもしれない。

    }

    public static <T> void sortIt(List<T> list,
                                  Comparator<? super T> comparator // TまたはTのスーパクラスと同じ型のComparatorを使うことができるという意味
    ) {
        System.out.println("Sorting with Comparator: " + comparator.toString());
        list.sort(comparator);
        for (var employee : list){
            System.out.println(employee);
        }
    }

}
