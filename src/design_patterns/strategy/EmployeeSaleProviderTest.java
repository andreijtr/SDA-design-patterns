package design_patterns.strategy;

public class EmployeeSaleProviderTest {
    public static void main(String[] args) {
        EmployeeSalaryProvider employeeSalaryProvider = new EmployeeSalaryProvider();

        Employee juniorEmployee = new Employee(EmployeeType.JUNIOR, 0);
        System.out.println(employeeSalaryProvider.getSalary(juniorEmployee));

        Employee middleEmployee = new Employee(EmployeeType.MIDDLE, 3);
        System.out.println(employeeSalaryProvider.getSalary(middleEmployee));

        Employee seniorEmployee = new Employee(EmployeeType.SENIOR, 3);
        System.out.println(employeeSalaryProvider.getSalary(seniorEmployee));
    }
}
