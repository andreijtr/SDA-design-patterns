package design_patterns.strategy.salary.strategy;

import design_patterns.strategy.Employee;
import design_patterns.strategy.EmployeeType;

public interface SalaryCalculatorStrategy {
    int getSalary(Employee employee);
    boolean accepts(EmployeeType employeeType);
}
