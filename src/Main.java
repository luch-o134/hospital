import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("=========================================");
        System.out.println("   SISTEMA DE GESTIÓN HOSPITALARIA");
        System.out.println("=========================================");
        System.out.println("Seleccione su cargo porfavor:");
        System.out.println("1. Recepcionista");
        System.out.println("2. Medico / Doctor");
        System.out.println("3. Salir");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion_cargo = 0;

        do {
            menu();
            opcion_cargo = sc.nextInt();
            switch (opcion_cargo) {
                case 1:
                    System.out.println("hola recepcionista");
                    break;
                case 2:
                    System.out.println("hola pa");
                    break;
                case 3:
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("opcion no valida papito");
                    break;
            }
        } while (opcion_cargo != 3);

        sc.close();

    }
}