import java.io.BufferedReader;

public class Calculator {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
            System.out.println("Enter a grade");

            double num1 = Double.parseDouble(br.readLine());

            System.out.println("Enter second grade:");

            Double num2 = Double.parseDouble(br.readLine());

            String op = br.readLine();

            double result = 0;

            if (op.equals("+")) {
                result = num1 + num2;
            } else if (op.equals("-")) {
                result = num1 - num2;
            } else if (op.equals("*")) {
                result = num1 * num2;
            } else if (op.equals(num1 / num2)) {
                result = num1 / num2;
            }

            System.out.println(result);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
