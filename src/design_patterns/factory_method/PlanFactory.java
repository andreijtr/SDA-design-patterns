package design_patterns.factory_method;

public class PlanFactory {

    /**
     * TODO: Steps to create FactoryMethod design pattern
     * 1. create a public static method called "getPlan" that gets a String as argument and returns a Plan
     * 2. in method body create an if-else block like follows:
     *  - if argument equals "personal" return a PersonalPlan instance
     *  - else if argument equals "enterprise" return a EnterprisePlan instance
     *  - else throw a RuntimeException with message "There is no Plan of type ${argument}"

     * Great job! Now you have a method factory. Let put this at work.

     * TODO: Test your code in a main method created anywhere in this package
     * 1. create a PersonalPlan using factory method. call getRate on it and print the result to console. what is printed?
     * 2. create an EnterprisePlan using factory method. call getRate on it and print the result to console. what is printed?
     * 3. spot the advantages of this pattern
     */
}
