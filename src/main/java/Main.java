import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a = enterNums();
        int b = enterNums();
        char select = selectOperation();
        int result = operation(select, a, b);
        System.out.println(result);
    }

    public static int operation(char select, int a, int b) {
        int c;
        switch (select) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                c = a / b;
                break;
            default:
                System.out.println("Unrecognized operation!  Try again :c");
                c = operation(selectOperation(), a, b);
        }
        return c;
    }

    public static char selectOperation()
    {
        System.out.println("Enter '+' '-' '*' or '/' to select the operation");
        char select;
        if(scanner.hasNext())
            select = scanner.next().charAt(0);
        else
        {
            System.out.println("You made a mistake! Try again :c");
            scanner.next();
            select = selectOperation();
        }
        return select;
    }

    public static int enterNums() {
        System.out.println("Enter a number");
        int num;
        if (scanner.hasNextInt())
            num = scanner.nextInt();
        else
        {
            System.out.println("You made a mistake! Try again :c");
            scanner.next();
            num = enterNums();
        }
        return num;
    }
}
