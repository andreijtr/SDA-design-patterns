package design_patterns.singleton;

/**
 * This class is singleton: only one instance of this type exists in application.
 */
public class SingletonService {
    /**
     * Steps to create a singleton class:
     * 1. create a private constructor
     * 2. declare a private static final (constant) variable of this type and assign an object instantiated using private constructor from step 1
     * 3. create a public static method called "getInstance" that returns the static variable from step 2
     * <p>
     * Now you have a singleton class. Great. Let put this at work.
     * Create a public method that returns a String with text "Design patterns are fun".
     */
    private static SingletonService instance = new SingletonService();
    private SingletonService() {}

    public static SingletonService getInstance() {
        return instance;
    }

}
