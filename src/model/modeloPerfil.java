package model;

import include.Perfil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class modeloPerfil  extends conexion {
    public boolean insertarPerfil(Perfil perfil) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO perfil_usuario (idperfil, nombre_usuario, apellido_p_usuario, apellido_m_usuario, rfc_usuario, email_usuario, telefono_usuario, domicilio_usuario, colonia_usuario, codigo_postal_usuario, ciudad_usuario, estado_usuario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, perfil.getIdperfil());
            pst.setString(2, perfil.getNombre_usuario());
            pst.setString(3, perfil.getApellido_p_usuario());
            pst.setString(4, perfil.getApellido_m_usuario());
            pst.setString(5, perfil.getRfc_usuario());
            pst.setString(6, perfil.getEmail_usuario());
            pst.setString(7, perfil.getTelefono_usuario());
            pst.setString(8, perfil.getDomicilio_usuario());
            pst.setString(9, perfil.getColonia_usuario());
            pst.setString(10, perfil.getCodigo_postal_usuario());
            pst.setString(11, perfil.getCiudad_usuario());
            pst.setString(12, perfil.getEstado_usuario());

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





    public ArrayList<Perfil> obtenerPerfiles() {
        ArrayList<Perfil> Perfiles = new ArrayList<Perfil>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT  idperfil, nombre_usuario, apellido_p_usuario, apellido_m_usuario, " +
                    "rfc_usuario, email_usuario, telefono_usuario, domicilio_usuario, colonia_usuario, " +
                    "codigo_postal_usuario, ciudad_usuario, estado_usuario FROM perfil_usuario";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Perfiles.add(new Perfil(rs.getInt("idperfil"),
                        rs.getString("nombre_usuario"),
                        rs.getString("apellido_p_usuario"),
                        rs.getString("apellido_m_usuario"),
                        rs.getString("rfc_usuario"),
                        rs.getString("email_usuario"),
                        rs.getString("telefono_usuario"),
                        rs.getString("domicilio_usuario"),
                        rs.getString("colonia_usuario"),
                        rs.getString("codigo_postal_usuario"),
                        rs.getString("ciudad_usuario"),
                        rs.getString("estado_usuario")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {

            }
        }
        return Perfiles;
    }



    public ArrayList<Perfil> obtenerPerfil(int Idperfil){
        ArrayList<Perfil> perfil = new ArrayList<Perfil>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT  idperfil, nombre_usuario, apellido_p_usuario, apellido_m_usuario,  " +
                    "rfc_usuario, email_usuario, telefono_usuario, domicilio_usuario, colonia_usuario, " +
                   "codigo_postal_usuario, ciudad_usuario, estado_usuario FROM perfil_usuario WHERE idperfil = ?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, Idperfil);
            rs = pst.executeQuery();
            while (rs.next()){
                perfil.add(new Perfil(rs.getInt("idperfil"),
                        rs.getString("nombre_usuario"),
                        rs.getString("apellido_p_usuario"),
                        rs.getString("apellido_m_usuario"),
                        rs.getString("rfc_usuario"),
                        rs.getString("email_usuario"),
                        rs.getString("telefono_usuario"),
                        rs.getString("domicilio_usuario"),
                        rs.getString("colonia_usuario"),
                        rs.getString("codigo_postal_usuario"),
                        rs.getString("ciudad_usuario"),
                        rs.getString("estado_usuario")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(getConection() != null)getConection().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return perfil;
    }

    public boolean actualizarPerfil(Perfil perfil){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "UPDATE perfil_usuario SET idperfil = ?, nombre_usuario = ?, " +
                    "apellido_p_usuario = ?, apellido_m_usuario = ?,  " +
                    "rfc_usuario = ?, email_usuario = ?, telefono_usuario = ?, " +
                    "domicilio_usuario = ?, colonia_usuario = ?, " +
                    "codigo_postal_usuario = ?, ciudad_usuario = ?, estado_usuario = ? WHERE idperfil = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,perfil.getIdperfil());
            pst.setString(2,perfil.getNombre_usuario());
            pst.setString(3,perfil.getApellido_p_usuario());
            pst.setString(4,perfil.getApellido_m_usuario());
            pst.setString(5, perfil.getRfc_usuario());
            pst.setString(6, perfil.getEmail_usuario());
            pst.setString(7, perfil.getTelefono_usuario());
            pst.setString(8, perfil.getDomicilio_usuario());
            pst.setString(9, perfil.getColonia_usuario());
            pst.setString(10, perfil.getCodigo_postal_usuario());
            pst.setString(11, perfil.getCiudad_usuario());
            pst.setString(12, perfil.getEstado_usuario());
            pst.setInt(13,perfil.getIdperfil());

            if(pst.executeUpdate() == 1){
                flag = true;
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception a) {
                System.out.println(a.getMessage());
            }
        }
        return flag;
    }

    public boolean borrarPerfil(int idperfil){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "DELETE FROM perfil_usuario WHERE idperfil = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, idperfil);


            if(pst.executeUpdate() == 1){
                flag = true;
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }




}
