import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        readOneExpression();
        readThreeExpressions();
    }

    static void readOneExpression() throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("lab4/one_expression.txt"))) {
            System.out.println("\nReading one expression from one_expression.txt...");
            var exp = new Expression(reader.readLine());
            System.out.println("Result: " + exp.evaluate());
        }
    }

    static void readThreeExpressions() throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("lab4/three_expressions.txt"))) {
            System.out.println("\nReading expressions from three_expression.txt...");
            for (int i = 0; i < 3; i++) {
                var exp = new Expression(reader.readLine().substring(3));
                try {
                    System.out.printf("Result %d: %f\n", i + 1, exp.evaluate());
                } catch (IndexOutOfBoundsException e) {
                    System.out.println((i + 1) + " is wrong expression");
                }
                
            }
        }
    }

    static void readFromConsole() throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write your line: ");
        String input = reader.readLine();
        var exp = new Expression(input);
        System.out.println(exp.evaluate());
    }

    
}