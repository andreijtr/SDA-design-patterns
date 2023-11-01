package design_patterns.factory_method;

public class FactoryMethodTest {

    public static void main(String[] args) {
        Plan plan = PlanFactory.getPlan("personal");
        System.out.println(plan.getRate());

        Plan plan2 = PlanFactory.getPlan("enterprise");
        System.out.println(plan2.getRate());
    }
}
