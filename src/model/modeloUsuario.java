package model;

import include.Usuario;
import include.tipodeusuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class modeloUsuario  extends conexion {
    public boolean insertarUsuario(Usuario usuario) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO usuario (idusuario, usuario, password, last_access, TipoUsuario_idtipoUsuario) VALUES (?,?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, usuario.getIdusuario());
            pst.setString(2, usuario.getUsuario());
            pst.setString(3, usuario.getPassword());
            pst.setString(4, usuario.getLast_access());
            pst.setInt(5, usuario.getTipoUsuario_idtipoUsuario());


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



    public ArrayList<tipodeusuario> obtenerIdtipodeusuarioFK() {
        ArrayList<tipodeusuario> tipodeusuario = new ArrayList<tipodeusuario>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT idtipoUsuario, nombre FROM tipoUsuario ";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                tipodeusuario.add(new tipodeusuario(
                        rs.getInt("idtipoUsuario"),
                        rs.getString("nombre")));
            }
        } catch (Exception e) {

        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {

            }
        }
        return tipodeusuario;
    }

    public ArrayList<Usuario> obtenerUsuarios() {
        ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT  idusuario, usuario, password, last_access, tipoUsuario_idtipoUsuario FROM usuario";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Usuarios.add(new Usuario(rs.getInt("idusuario"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        rs.getString("last_access"),
                        rs.getInt("tipoUsuario_idtipoUsuario")));



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
        return Usuarios;
    }


    public ArrayList<Usuario> obtenerUsuario(int Idusuario){
        ArrayList<Usuario> usuario = new ArrayList<Usuario>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT  idusuario, usuario, password, last_access, tipoUsuario_idtipoUsuario FROM usuario WHERE idusuario = ?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, Idusuario);
            rs = pst.executeQuery();
            while (rs.next()){
                usuario.add(new Usuario(rs.getInt("idusuario"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        rs.getString("last_access"),
                        rs.getInt("tipoUsuario_idtipoUsuario")));
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
        return usuario;
    }

    public boolean actualizarUsuario(Usuario usuario){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "UPDATE usuario SET idusuario = ?, usuario = ?, " +
                    "password = ?, last_access = ?, tipoUsuario_idtipoUsuario = ? WHERE idusuario = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,usuario.getIdusuario());
            pst.setString(2,usuario.getUsuario());
            pst.setString(3,usuario.getPassword());
            pst.setString(4,usuario.getLast_access());
            pst.setInt(5,usuario.getTipoUsuario_idtipoUsuario());
            pst.setInt(6, usuario.getIdusuario());


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

    public boolean borrarUsuario(int idusuario){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "DELETE FROM usuario WHERE idusuario = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, idusuario);


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