package design_patterns.builder;

public class StudentBuilder {

    public static StudentBuilder createInstance() {
        return  new StudentBuilder();
    }
    private String name;
    private int age;

    private String description;
    private Double gradeAverageFirstYear;
    private Double gradeAverageSecondYear;
    private Double gradeAverageThirdYear;
    private Double gradeAverageFourthYear;

    private StudentBuilder() {}

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder description(String description) {
        this.description = description;
        return this;
    }

    public StudentBuilder gradeAverageFirstYear(Double gradeAverageFirstYear) {
        this.gradeAverageFirstYear = gradeAverageFirstYear;
        return this;
    }

    public StudentBuilder gradeAverageSecondYear(Double gradeAverageSecondYear) {
        this.gradeAverageSecondYear = gradeAverageSecondYear;
        return this;
    }

    public StudentBuilder gradeAverageThirdYear(Double gradeAverageThirdYear) {
        this.gradeAverageThirdYear = gradeAverageThirdYear;
        return this;
    }

    public StudentBuilder gradeAverageFourthYear(Double gradeAverageFourthYear) {
        this.gradeAverageFourthYear = gradeAverageFourthYear;
        return this;
    }

    public Student build() {
        return new Student(this.name, this.age, this.description, gradeAverageFirstYear, gradeAverageSecondYear, gradeAverageThirdYear, gradeAverageFourthYear);
    }

    // test
}
