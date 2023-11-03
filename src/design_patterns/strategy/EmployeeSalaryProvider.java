package design_patterns.strategy;

import design_patterns.strategy.salary.resolver.SalaryCalculatorResolver;

public class EmployeeSalaryProvider {

    private SalaryCalculatorResolver salaryCalculatorResolver;

    public EmployeeSalaryProvider() {
        this.salaryCalculatorResolver = new SalaryCalculatorResolver();
    }

    public int getSalary(Employee employee) {
        return salaryCalculatorResolver.resolve(employee.getType()).getSalary(employee);
    }
}

/**
 * TODO Please answer to following questions:
 * What this code do? Understand the algorithm for each case.
 * Is this code respecting Single Responsibility principle? Why?
 * It this code respecting Open Closed principle? Why?
 */
