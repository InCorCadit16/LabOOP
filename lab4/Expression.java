import java.util.ArrayList;
import java.util.LinkedList;

public class Expression {
    String expression;
    ArrayList<Expression> subexpressions;
    

    public Expression(String expression) {
        this.expression = expression;
        this.subexpressions = new ArrayList<>();
    }

    public double evaluate() throws IndexOutOfBoundsException {
        LinkedList<Double> values = new LinkedList<>();
        LinkedList<Character> ops = new LinkedList<>();

        prepareExpression();

        char[] data = expression.toCharArray();

        for (int i = 0; i < data.length; i++) {
            
            if (data[i] >= '0' && data[i] <= '9') {
                var number = new StringBuilder();
                while(i < data.length && ((data[i] >= '0' && data[i] <= '9') || data[i] == '.')) {
                    number.append(data[i++]);
                }
                i--;
                values.add(Double.parseDouble(number.toString()));
            } else if (data[i] == '+' || data[i] == '-' || data[i] == '/' || data[i] == '*') {
                if (i == 0 && data[i] == '-' && (data[i + 1] >= '0' && data[i + 1] <= '9')) {
                    var number = new StringBuilder();
                    number.append(data[i++]);
                    while(i < data.length && data[i] >= '0' && data[i] <= '9') {
                        number.append(data[i++]);
                    }
                    values.add(Double.parseDouble(number.toString()));
                } else {
                    ops.add(data[i]);
                }   
            } else if (data[i] == 'n') {
                int index = data[++i] - '0';
                values.add(subexpressions.get(index).evaluate());
            }
        }

        for (int i = 0; i < ops.size(); i++) {
            double result = 0;
            if (ops.get(i) == '*') 
                result = values.get(i) * values.get(i+1);
            else if (ops.get(i) == '/') 
                result = values.get(i) / values.get(i+1);
            
            if (result != 0) {
                ops.remove(i);
                values.remove(i+1);
                values.remove(i);
                values.add(i, result);
                i--;
            }
        }

        for (int i = 0; i < ops.size(); i++) {
            double result = 0;
            if (ops.get(i) == '+') 
                result = values.get(i) + values.get(i+1);
            else if (ops.get(i) == '-') 
                result = values.get(i) - values.get(i+1);
            
            if (result != 0) {
                ops.remove(i);
                values.remove(i+1);
                values.remove(i);
                values.add(i, result);
                i--;
            }
        }

        return values.get(0);
    }

    private void prepareExpression() {
        expression = expression.replaceAll(" ", "");

        int counter = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                int end = i + 1 + findClosing(expression.substring(i + 1));
                if (end == -1 || end < i + 1) 
                    throw new IndexOutOfBoundsException("Wrong number of opening and closing paranthesis");
                String subexp = expression.substring(i + 1, end);
                subexpressions.add(new Expression(subexp));
                expression = expression.substring(0, i) + "n" + counter + expression.substring(end + 1);
                counter++;
            }
        }
    }

    private int findClosing(String subexp) {
        int balance = 1;
        for (int i = 0; i < subexp.length(); i++) {
            if (subexp.charAt(i) == ')') balance--;
            if (subexp.charAt(i) == '(') balance++;
            if (balance == 0) return i;
        }

        return -1;
    }
    
}
