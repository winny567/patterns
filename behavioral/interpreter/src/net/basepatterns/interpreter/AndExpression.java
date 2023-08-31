package net.basepatterns.interpreter;

public class AndExpression implements Expression{
    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean inteprret(String context) {
        return expression1.inteprret(context) && expression2.inteprret(context);
    }
}
