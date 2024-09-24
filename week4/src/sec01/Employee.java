package sec01;

public class Employee {
    protected String name;
    protected int salary;

    //생성자 메소드
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    //이름을 반환한다
    public String getName() {
        return name;
    }

    //급여를 반환한다
    public int getSalary() {
        return salary;
    }

    //급여를 올린다
    public int raiseSalary() {
        int increased_salary = (int) (salary * 1.3);
        return increased_salary;
    }

    //객체의 현 상태를 반환한다
    public String showInfo() {
        String result = "\n이름: " + name;
        result += "\n급여: " + salary;
        result += "\n인상된 급여: " + raiseSalary();
        return result;
    }

}
