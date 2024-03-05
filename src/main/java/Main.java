public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java -jar Calculator.jar <num1> <num2> <operation>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        String operation = args[2];

        double result = 0;

        switch (operation) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "x":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation: " + operation);
                return;
        }

        System.out.println("Result: " + result);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
}