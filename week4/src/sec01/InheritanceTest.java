package sec01;

public class InheritanceTest {
    public static void main(String[] args) {
        Employee emp = new Employee("김이화", 100000);
        Manager mng = new Manager("박이화", 200000, 50000);
        Executive exc = new Executive("양이화", 400000, 100000, 100000);

        emp.raiseSalary();
        mng.raiseSalary();
        exc.raiseSalary();

        System.out.println("===직원===");
        System.out.println(emp.showInfo());
        System.out.println();

        System.out.println("===매니터===");
        System.out.println(mng.showInfo());
        System.out.println();

        System.out.println("===임원===");
        System.out.println(exc.showInfo());
        System.out.println();
    }
}
