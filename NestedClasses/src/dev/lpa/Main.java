package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carole", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018)
        ));

        // var comparator = new EmployeeComparator<>();
        // employees.sort(comparator);

        employees.sort(new Employee.EmployeeComparator<>("employeeId")); // reversedでソートを逆にする
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10515, "Joe", 2021, "Walmart"),
                new StoreEmployee(10105, "Tom", 2020, "Macys"),
                new StoreEmployee(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee(10322, "Bud", 2016, "Target"))
        );

        var genericEmployee = new StoreEmployee();
        var comparator = genericEmployee.new StoreComparator<>();
        storeEmployees.sort(comparator);
        for (StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }

        System.out.println("With Pig Latin Names");
        addPigLatinName(storeEmployees);

    }

    public static void addPigLatinName(List<? // ジェネリック・ワイルドカード は引数の型の上限を指定。StoreEmployeeまたはそのサブタイプを含むリストのみを受け付けることを意味する
            extends StoreEmployee > list) {

        String lastName = "Piggy";

        // なぜクラスの中にクラスを作るのか外部に公開する必要のないクラスを作りたい時もある。データが密接につながっていて、隠蔽したい時もある。誰みも使ってほしくないし、拡張もしてほしくない。特定の目的のためだけに存在してほしい。
        class DecoratedEmployee extends StoreEmployee
        implements Comparable<DecoratedEmployee>{

            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLationName, Employee originalInstance) {
                this.pigLatinName = pigLationName + " " + lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.getName() + " " + pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size()); // クラスのListのサイズに揃える

        for (var employee : list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }

        newList.sort(null); // nullを渡すとComparableクラスのcompareToメソッドが使われる
        for (var dEmployee : newList) {
            // インナークラスは外側の変数や引数をキャプチャできるが、それらは「実質final」でなければならない。
            // キャプチャされた変数は、インナークラスのインスタンスごとにコピーされるのではなく、参照として保持される（ただし値型は値がコピーされるように見える）。
            // Java 8以降は「実質final」でもOK。
            // lastName = "Latin"; // 値を再代入しているのでコンパイルエラーになる
        }

    }
}
