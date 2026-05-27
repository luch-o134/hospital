import java.sql.Connection;
import java.sql.DriverManager;
import io.github.cdimascio.dotenv.Dotenv;

public class Conexion {
    public static Connection conectar() {
        Connection conexion = null;
        try {
            Dotenv dotenv = Dotenv.load();

            String url = dotenv.get("DB_URL");
            String usuario = dotenv.get("DB_USER");
            String contraseña = dotenv.get("DB_PASSWORD");

            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa");

        } catch (Exception e) {
            System.out.println("Error de conexión");
            System.out.println(e.getMessage());
        }
        return conexion;
    }
}