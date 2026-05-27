import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class EliminarPaciente {
    public static String eliminarPaciente(String rut){
        String sql = "DELETE FROM pacientes WHERE rut = ? RETURNING nombres, apellidos";

        try (Connection conex = Conexion.conectar(); PreparedStatement ps = conex.prepareStatement(sql)){
            ps.setString(1, rut);

            try (ResultSet rs = ps.executeQuery()){
                if (rs.next()){
                    String nombreEliminar = rs.getString("nombres") + " " + rs.getString("apellidos");
                    return nombreEliminar;
                }
            }

            return null;
        } catch (Exception e) {
            System.out.println("Error al eliminar al paciente de a base de datos " + e.getMessage());
            return null;
        }
    }
}
