import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        int num1;
        do{
            System.out.println("1.Repite mensaje");
            System.out.println("2.Media");
            System.out.println("3.Salir");
            option = scanner.nextInt();
            scanner.nextLine();
            if(option == 1) {
                System.out.println("Introduce un número mayor que 0:");
                num1 = scanner.nextInt();
                scanner.nextLine();
                while (num1 <= 0) {
                    System.out.println("Introduce otro número");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                }
                System.out.println("Imntroduce un mensaje de texto");
                String sentence = scanner.nextLine();

                for (int i = 0; i < num1; i++){
                    System.out.println(sentence);
                }
            }else if (option ==2){
                System.out.println("¿Cuántos números quieres introducir?");
                int n = scanner.nextInt();
                scanner.nextLine();

                while (n <= 0 ){
                    System.out.println("Introduce un número que sea mayor que cero");
                    n = scanner.nextInt();
                    scanner.nextLine();
                }

                double suma = 0;

                for(int i = 0; i < n; i++) {
                    System.out.println("Introduce un número: ");
                    int num2  =scanner.nextInt();
                    scanner.nextLine();
                    suma += num2;
                }
                double division = suma / n;
                System.out.println("La media es " + division);
            }else if (option == 3){
                System.out.println("Saliendo....");
            }else{
                System.out.println("Operación inválida");
            }
        }while(option != 3);
    }
}