package design_patterns.strategy.salary.resolver;

import design_patterns.strategy.EmployeeType;
import design_patterns.strategy.salary.service.BaseSalaryService;
import design_patterns.strategy.salary.strategy.*;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculatorResolver {
    private BaseSalaryService baseSalaryService;
    private JuniorSalaryCalculatorStrategy juniorSalaryCalculatorStrategy;
    private MiddleSalaryCalculatorStrategy middleSalaryCalculatorStrategy;
    private SeniorSalaryCalculatorStrategy seniorSalaryCalculatorStrategy;
    private List<SalaryCalculatorStrategy> strategies;

    public SalaryCalculatorResolver() {
        baseSalaryService = new BaseSalaryService();
        juniorSalaryCalculatorStrategy = new JuniorSalaryCalculatorStrategy(baseSalaryService);
        middleSalaryCalculatorStrategy = new MiddleSalaryCalculatorStrategy(baseSalaryService);
        seniorSalaryCalculatorStrategy = new SeniorSalaryCalculatorStrategy(baseSalaryService);
        strategies = Arrays.asList(juniorSalaryCalculatorStrategy, middleSalaryCalculatorStrategy, seniorSalaryCalculatorStrategy);
    }

    public SalaryCalculatorStrategy resolve(EmployeeType employeeType) {
        return strategies.stream()
                .filter(strategy -> strategy.accepts(employeeType))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee type " + employeeType + "not exists."));
    }
}
