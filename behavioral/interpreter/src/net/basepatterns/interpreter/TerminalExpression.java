package net.basepatterns.interpreter;

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean inteprret(String context) {
        return context.contains(data);
    }
}
