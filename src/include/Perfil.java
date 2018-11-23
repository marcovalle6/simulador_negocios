package include;

public class Perfil {
    private int idperfil;
    private String nombre_usuario;
    private String apellido_p_usuario;
    private String apellido_m_usuario;
    private String rfc_usuario;
    private String email_usuario;
    private String telefono_usuario;
    private String domicilio_usuario;
    private String colonia_usuario;
    private String codigo_postal_usuario;
    private String ciudad_usuario;
    private String estado_usuario;

    public Perfil(int idperfil, String nombre_usuario, String apellido_p_usuario, String apellido_m_usuario, String rfc_usuario, String email_usuario, String telefono_usuario, String domicilio_usuario, String colonia_usuario, String codigo_postal_usuario, String ciudad_usuario, String estado_usuario) {
        this.idperfil = idperfil;
        this.nombre_usuario = nombre_usuario;
        this.apellido_p_usuario = apellido_p_usuario;
        this.apellido_m_usuario = apellido_m_usuario;
        this.rfc_usuario = rfc_usuario;
        this.email_usuario = email_usuario;
        this.telefono_usuario = telefono_usuario;
        this.domicilio_usuario = domicilio_usuario;
        this.colonia_usuario = colonia_usuario;
        this.codigo_postal_usuario = codigo_postal_usuario;
        this.ciudad_usuario = ciudad_usuario;
        this.estado_usuario = estado_usuario;
    }
    public int getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(int idperfil) {
        this.idperfil = idperfil;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_p_usuario() {
        return apellido_p_usuario;
    }

    public void setApellido_p_usuario(String apellido_p_usuario) {
        this.apellido_p_usuario = apellido_p_usuario;
    }

    public String getApellido_m_usuario() {
        return apellido_m_usuario;
    }

    public void setApellido_m_usuario(String apellido_m_usuario) {
        this.apellido_m_usuario = apellido_m_usuario;
    }

    public String getRfc_usuario() {
        return rfc_usuario;
    }

    public void setRfc_usuario(String rfc_usuario) {
        this.rfc_usuario = rfc_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public String getDomicilio_usuario() {
        return domicilio_usuario;
    }

    public void setDomicilio_usuario(String domicilio_usuario) {
        this.domicilio_usuario = domicilio_usuario;
    }

    public String getColonia_usuario() {
        return colonia_usuario;
    }

    public void setColonia_usuario(String colonia_usuario) {
        this.colonia_usuario = colonia_usuario;
    }

    public String getCodigo_postal_usuario() {
        return codigo_postal_usuario;
    }

    public void setCodigo_postal_usuario(String codigo_postal_usuario) {
        this.codigo_postal_usuario = codigo_postal_usuario;
    }

    public String getCiudad_usuario() {
        return ciudad_usuario;
    }

    public void setCiudad_usuario(String ciudad_usuario) {
        this.ciudad_usuario = ciudad_usuario;
    }

    public String getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(String estado_usuario) {
        this.estado_usuario = estado_usuario;
    }
}


