package design_patterns.strategy.salary.strategy;

import design_patterns.strategy.Employee;
import design_patterns.strategy.EmployeeType;
import design_patterns.strategy.salary.service.BaseSalaryService;

public class SeniorSalaryCalculatorStrategy implements SalaryCalculatorStrategy {

    private BaseSalaryService baseSalaryService;

    public SeniorSalaryCalculatorStrategy(BaseSalaryService baseSalaryService) {
        this.baseSalaryService = baseSalaryService;
    }

    @Override
    public int getSalary(Employee employee) {
        return baseSalaryService.get() + (employee.getYearsOfExperience() * 200);
    }

    @Override
    public boolean accepts(EmployeeType employeeType) {
        return employeeType.equals(EmployeeType.SENIOR);
    }
}
