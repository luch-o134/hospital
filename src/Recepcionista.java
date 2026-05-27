import java.util.Scanner;

public class Recepcionista extends Paciente {

    public Recepcionista(int id, String rut, String nombres, String apellidos, String fecha_nacimiento,
            String grupo_sanguineo, String contacto_emergencia) {
        super(id, rut, nombres, apellidos, fecha_nacimiento, grupo_sanguineo, contacto_emergencia);
    }

    public static void menuRecepcionista() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("=============================================");
            System.out.println("Bievenida recepcionista");
            System.out.println("---------------------------------------------");
            System.out.println("Que es lo que decea hacer en esta ocacion");
            System.out.println("1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Modificar persona");
            System.out.println("4. Generar cita");
            System.out.println("5. Modificar cita");
            System.out.println("6. Salir");

            try {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("========= REGISTRAR NUEVO PACIENTE ============");
                        System.out.println("-----------------------------------------------");
                        System.out.println("Ingrese el rut de la persona (ej: 12345678-9): ");
                        String rut = sc.nextLine();

                        System.out.println("Ingrese los nombres de la persona: ");
                        String nombres = sc.nextLine();

                        System.out.println("Ingrese los apellidos de la persona: ");
                        String apellidos = sc.nextLine();

                        String fecha_nacimiento = "";
                        while (true) {
                            System.out.println("Ingrese la fecha de nacimiento de la persona (ej: 1991-08-05): ");
                            fecha_nacimiento = sc.nextLine().trim();

                            try {
                                java.time.LocalDate.parse(fecha_nacimiento);
                                break;
                            } catch (java.time.format.DateTimeParseException e) {
                                System.out.println(" Error = El formato o la fecha ingresada es inválida.");
                                System.out.println("Asegúrate de usar números con guiones en orden Año-Mes-Día (ej: 1991-08-05).\n");
                            }
                        }

                        System.out.println("Ingrese al grupo sanguineo que pertenece la persona: ");
                        String grupo_sanguineo = sc.nextLine();

                        System.out.println("Ingrese el contacto de emergencia de la persona: ");
                        String contacto_emergencia = sc.nextLine();

                        Paciente nuevoPaciente = new Paciente(0, rut, nombres, apellidos, fecha_nacimiento,
                                grupo_sanguineo, contacto_emergencia);

                        System.out.println("\n Ingresando al nuevo paciente a la base de datos...");

                        boolean exitosa = AgregarPacientes.datosPaciente(nuevoPaciente);

                        if (exitosa) {
                            System.out.println("El paciente fue ingresado correctamente a la base de datos");
                        } else {
                            System.out.println("\n Error: El paciente no se pudo agregar a la base de datos ");
                        }
                        break;
                    case 2:
                        System.out.println("========= ZOAN DE ELIMINACION DE PERSONA ============");
                        System.out.println("Ingrese el rut de la persona que desea eliminar del hospital: ");
                        String rutEliminar = sc.nextLine();

                        String nombreEliminar = EliminarPaciente.eliminarPaciente(rutEliminar);

                        if (nombreEliminar != null) {
                            System.out.println("El paciente " + nombreEliminar + " se a eliminado con exito");
                        }else{
                            System.out.println("No se encontro el rut");
                        }
                        break;
                    case 3:
                        System.out.println("========= Agregando persona ============");

                        break;
                    case 4:
                        System.out.println("========= Agregando persona ============");

                        break;
                    case 5:
                        System.out.println("========= Agregando persona ============");

                        break;
                    case 6:
                        System.out.println("========= Agregando persona ============");

                        break;
                    default:
                        System.out.println("Opcion invalida porfavor seleccione una opcion del 1 al 6");
                        break;
                }
            } catch (Exception e) {
                System.out
                        .println("su valor ingresado es " + e.getMessage() + " Porfavor ingrese solo numeros enteros");
                sc.nextLine();
                opcion = 0;
            }
        } while (opcion != 6);

    }
}