package dev.lpa.domain;


import java.util.Comparator;

public class Employee {

    // Employeeクラスの中に静的なクラスをネストしている
    // 外側のクラスのprivateメンバーにアクセスできる。ゲッターやセッターを用意しなくても良い。
    public static class EmployeeComparator <T extends Employee>
            implements Comparator <Employee>
    {
        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {

            if (sortType.equalsIgnoreCase("yearStarted")) {
                return o1.yearStarted - o2.yearStarted;
            }

            if (sortType.equalsIgnoreCase("employeeId")) {
                return o1.employeeId - o2.employeeId;
            }

            return o1.getName().compareTo(o2.getName());
        }
    }

    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee() {
    }

    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId, name ,yearStarted);
    }
}
