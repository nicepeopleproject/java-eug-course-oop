package lessonExamples.behavioralPatterns.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEExpression();

        System.out.println("Does developer knows Java core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEEDeveloper.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);

    }
}
