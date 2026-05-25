import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar() {
        Connection conexion = null;
        try {
            String url = "jdbc:mysql://192.168.87.121:3306/dylan_hospital";
            String usuario = "luis";
            String contraseña = "labcode";
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println("Error de conexión");
            System.out.println(e.getMessage());
        }
        return conexion;
    }
}