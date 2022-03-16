package myExample.behavioralPatterns.interpreter;

public class Client {
    public static void main(String[] args) {
        Expression isCandidateGoodForUs = getGoodCandidate();
        System.out.println("Is candidate satisfying?: " + isCandidateGoodForUs.interpret("Java Python"));
        System.out.println("Is candidate satisfying?: " + isCandidateGoodForUs.interpret("Math Statistics"));
    }

    public static Expression getGoodCandidate() {
        Expression knowsMath = new TerminalExpression("Math");
        Expression knowsPython = new TerminalExpression("Python");
        Expression knowsJava = new TerminalExpression("Java");

        return new TwoOfThreeTrueExpression(knowsMath, knowsPython, knowsJava);
    }
}
