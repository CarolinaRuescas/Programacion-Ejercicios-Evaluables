import java.util.Scanner;

public class Tarea2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    public static int calculatePotencia(int num1, int num2){
        int elevated = 1;
        for (int i = 0; i < num2; i++){
            elevated = elevated * num1;
        }
        return elevated;
    }
    public static int[] calculateArray(int[] numbers, int num1) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = calculatePotencia(numbers[i], num1);
        }
        return numbers;
    }
    public static int[] askArray() {
        System.out.println("Ingrese la cantida total de números de los cuales quiere calcular su potencia: ");
        int[] numbers = new int[askNumberBigOne()];
        System.out.println("Perfecto!, ingrese dichos números: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Le queda " + (numbers.length - i) + " por ingresar");
            numbers[i] = askNumberBigOne();
        }
        return numbers;
    }
    public static int askNumberBigOne() {
        Scanner scanner = new Scanner (System.in);
        int number;
        do {
            number = scanner.nextInt();
            scanner.nextLine();
            if (number <= 1) {
                System.out.println("El número que ingrese debe ser mayor a 1:");
            }
        } while (number <= 1);
        return number;
    }
    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }
    public static int chooseOption() {
        System.out.println("Elija una opción:");
        System.out.println("1. Elevar un array a potencia");
        System.out.println("2. Elevar un número a potencia");
        System.out.println("3. Salir");

        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
    public static void menu() {
        int option;
        do {
            option = chooseOption();
            if (option == 1) {
                System.out.println("Ingrese un número para que sea la potencia.");
                int num2 = askNumberBigOne();
                int[] num1 = calculateArray(askArray(), num2);
                System.out.print("El resultado es: ");
                printArray(num1);
            } else if (option == 2) {
                System.out.println("Ingrese un número para que sea la base");
                int num1 = askNumberBigOne();
                System.out.println("Ingrese un número para que sea la potencia");
                int num2 = askNumberBigOne();
                System.out.println("El resultado es: " + calculatePotencia(num1, num2));
            } else if (option == 3) {
                System.out.println("¡Saliendo...!");
            } else {
                System.out.println("Valor erroneo");
            }
        } while (option != 3);
    }
}