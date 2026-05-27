import java.sql.Connection;
import java.sql.PreparedStatement;

public class AgregarPacientes {
    public static boolean datosPaciente(Paciente paciente) {
        String sql = "INSERT INTO pacientes(rut, nombres, apellidos, fecha_nacimiento, grupo_sanguineo, contacto_emergencia) VALUES(?, ?, ?, ?, ?, ?)";

        try (Connection conex = Conexion.conectar(); PreparedStatement ps = conex.prepareStatement(sql)) {

            ps.setString(1, paciente.getRut());
            ps.setString(2, paciente.getNombres());
            ps.setString(3, paciente.getApellidos());
            ps.setDate(4, java.sql.Date.valueOf(paciente.getFecha_nacimiento()));
            ps.setString(5, paciente.getGrupo_sanguineo());
            ps.setString(6, paciente.getContacto_emergencia());

            int filasInsertadas = ps.executeUpdate();

            return filasInsertadas > 0;
        } catch (Exception e) {
            System.out.println("Error al ingresar al paciente a la base de datos " + e.getMessage());
            return false;
        }
    }
}