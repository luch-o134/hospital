public class Paciente {
    private int id;
    private String rut;
    private String nombres;
    private String apellidos;
    private String fecha_nacimiento;
    private String grupo_sanguineo;
    private String contacto_emergencia;

    public Paciente(int id, String rut, String nombres, String apellidos, String fecha_nacimiento,
            String grupo_sanguineo, String contacto_emergencia) {
        this.id = id;
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grupo_sanguineo = grupo_sanguineo;
        this.contacto_emergencia = contacto_emergencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

    public String getContacto_emergencia() {
        return contacto_emergencia;
    }

    public void setContacto_emergencia(String contacto_emergencia) {
        this.contacto_emergencia = contacto_emergencia;
    }

}
