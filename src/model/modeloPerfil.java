package model;

import include.Perfil;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class modeloPerfil  extends conexion {
    public boolean insertarPerfil(Perfil perfil) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO perfil_usuario (nombre_usuario, apellido_p_usuario, apellido_m_usuario, rfc_usuario, email_usuario, telefono_usuario, domicilio_usuario, colonia_usuario, codigo_postal_usuario, ciudad_usuario, estado_usuario) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, perfil.getNombre_usuario());
            pst.setString(2, perfil.getApellido_p_usuario());
            pst.setString(3, perfil.getApellido_m_usuario());
            pst.setString(4, perfil.getRfc_usuario());
            pst.setString(5, perfil.getEmail_usuario());
            pst.setString(6, perfil.getTelefono_usuario());
            pst.setString(7, perfil.getDomicilio_usuario());
            pst.setString(8, perfil.getColonia_usuario());
            pst.setString(9, perfil.getCodigo_postal_usuario());
            pst.setString(10, perfil.getCiudad_usuario());
            pst.setString(11, perfil.getEstado_usuario());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (getConection() != null) {
                    getConection().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }
}
