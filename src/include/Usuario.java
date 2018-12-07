package include;


public class Usuario {

    private int idusuario;
    private String usuario;
    private String password;
    private String last_access;
    private int tipoUsuario_idtipoUsuario;



    public Usuario(int idusuario, String usuario, String password, String last_access, int tipoUsuario_idtipoUsuario) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.password = password;
        this.last_access = last_access;
        this.tipoUsuario_idtipoUsuario = tipoUsuario_idtipoUsuario;

    }


    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLast_access() {
        return last_access;
    }

    public void setLast_access(String last_access) {
        this.last_access = last_access;
    }

    public int getTipoUsuario_idtipoUsuario() {
        return tipoUsuario_idtipoUsuario;
    }

    public void setTipoUsuario_idtipoUsuario(int tipoUsuario_idtipoUsuario) {
        this.tipoUsuario_idtipoUsuario = tipoUsuario_idtipoUsuario;
    }
}
