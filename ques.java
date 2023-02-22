class Calculator {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}

public class ques {
    public static void main(String[] args) {

        int n1 = 4;
        int n2 = 6;

        Calculator calc = new Calculator(); // object creation
        int y = calc.sum(n1, n2);
        System.out.println("Your answer is:" + y);

    }
}
