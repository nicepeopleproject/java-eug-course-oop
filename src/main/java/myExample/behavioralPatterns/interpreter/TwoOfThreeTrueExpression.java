package myExample.behavioralPatterns.interpreter;

public class TwoOfThreeTrueExpression implements Expression {
    Expression expression1;
    Expression expression2;
    Expression expression3;

    public TwoOfThreeTrueExpression(Expression expression1, Expression expression2, Expression expression3) {
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.expression3 = expression3;
    }

    @Override
    public boolean interpret(String context) {
        return (expression1.interpret(context) && expression2.interpret(context) ||
                expression1.interpret(context) && expression3.interpret(context) ||
                expression2.interpret(context) && expression3.interpret(context));
    }
}
